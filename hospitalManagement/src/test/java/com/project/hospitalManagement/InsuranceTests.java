package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Appointment;
import com.project.hospitalManagement.entity.Insurance;
import com.project.hospitalManagement.entity.Patient;

import com.project.hospitalManagement.service.AppointmentService;
import com.project.hospitalManagement.service.InsuranceService;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@SpringBootTest
public class InsuranceTests {

@Autowired
    private  InsuranceService insuranceService;
@Autowired
private AppointmentService appointmentService;
    @Test
    public void testInsurance(){
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(1992,02,03))
                .build();

           Patient patient= insuranceService.assignInsuranceToPatient(insurance,1L);
        System.out.println(patient);
    }

    @Test
    public void testCreateAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,11,1,14,0,0))
                .reason("Cancer")
                .build();

       var newAppointment= appointmentService.createNewAppointment(appointment,1L,2L);
        System.out.println(newAppointment);
    }

}
