package com.project.hospitalManagement.repository;

import com.project.hospitalManagement.dto.BloodGroupCountResponseEntity;
import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByName(String name);
    List<Patient> findByBirthDate(LocalDate birthDate);

    @Query("SELECT p FROM Patient p where p.bloodGroup =?1")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    @Query("select p from Patient p where p.birthDate> :birthDate")
    List<Patient> findByBornAfterDate(@Param("birthDate")LocalDate birthDate);

    @Query("select new com.project.hospitalManagement.dto.BloodGroupCountResponseEntity(p.bloodGroup , count(p)) from Patient p group by p.bloodGroup")
//    List<Object[]> countEachBloodGroupTypes();
    List<BloodGroupCountResponseEntity> countEachBloodGroupTypes();

    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.name= :name where p.id =:id")
    int updateNameWithId(@Param("name") String name, @Param("id") Long id);

}
