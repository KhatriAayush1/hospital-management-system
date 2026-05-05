package com.project.hospitalManagement.dto;


import com.project.hospitalManagement.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodGroupCountResponseEntity {

    private BloodGroupType bloodGroupType;
    private  Long count;

}
