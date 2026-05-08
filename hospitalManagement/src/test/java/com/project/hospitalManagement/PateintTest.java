package com.project.hospitalManagement;

import com.project.hospitalManagement.dto.BloodGroupCountResponseEntity;
import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.entity.type.BloodGroupType;
import com.project.hospitalManagement.repository.PatientRepository;
import com.project.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class PateintTest {

   @Autowired
    private PatientRepository patientRepository;

   @Autowired
   private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList= patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);


    }

    @Test
    public void testTranscationMethod(){
//        Patient patient= patientService.getPatientById(1L);
////        System.out.println(patient);
//        Patient patient = patientRepository.findByName("Diva Patel");
//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1988,3,15));
//       for(Patient p:patientList){
//           System.out.println(p);
//       }
//
List<BloodGroupCountResponseEntity> bloodGroupList= patientRepository.countEachBloodGroupTypes();
    for(BloodGroupCountResponseEntity objects:bloodGroupList){
        System.out.println(objects);
    }

    int rowsUpdated = patientRepository.updateNameWithId("Diva Patel", 2L);
        System.out.println(rowsUpdated);
    }

}
