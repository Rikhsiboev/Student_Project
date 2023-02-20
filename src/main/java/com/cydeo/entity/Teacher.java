package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@NoArgsConstructor
@Data
public class Teacher extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private BigDecimal salary;
    private School school;
    private List<Course> courses;

    public Teacher(int id, String firstName, String lastName, String phoneNumber, BigDecimal salary, School school, List<Course> courses) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.school = school;
        this.courses = courses;
    }

}
