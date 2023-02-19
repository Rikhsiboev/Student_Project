package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private BigDecimal salary;
    private School school;
    private List<Course> courses;

}
