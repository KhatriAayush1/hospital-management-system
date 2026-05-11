package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Appointment;
import com.project.hospitalManagement.entity.Insurance;
import com.project.hospitalManagement.entity.Patient;

import com.project.hospitalManagement.repository.PatientRepository;
import com.project.hospitalManagement.service.AppointmentService;
import com.project.hospitalManagement.service.InsuranceService;

import com.project.hospitalManagement.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@SpringBootTest
public class InsuranceTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {

        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);

    }

    @Test
    public void testTransactionMethods() {
//        Patient patient = patientService.getPatientById(1L);

//        Patient patient = patientRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException("Patient not " +
//                "found with id: 1"));

//        Patient patient = patientRepository.findByName("Diya Patel");

//        List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1988, 3, 15), "diya" +
//                ".patel@example.com");

//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1993, 3, 14));

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2, Sort.by("name")));

        for(Patient patient: patientList) {
            System.out.println(patient);
        }
//
//        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(Object[] objects: bloodGroupList) {
//            System.out.println(objects[0] +" "+ objects[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Arav Sharma", 1L);
//        System.out.println(rowsUpdated);

//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(BloodGroupCountResponseEntity bloodGroupCountResponse: bloodGroupList) {
//            System.out.println(bloodGroupCountResponse);
//        }
    }
}


