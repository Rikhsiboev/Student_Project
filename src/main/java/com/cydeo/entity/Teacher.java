package com.cydeo.entity;

import lombok.Getter;
import lombok.Setter;
import net.datafaker.PhoneNumber;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Teacher extends BaseEntity{

    private String firstName, lastName;
    private PhoneNumber phoneNumber;
    private Double salary;
    private UUID schoolUUID;
    private List<UUID> courses;

    public Teacher(UUID id, String firstName, String lastName, PhoneNumber phoneNumber, Double salary, UUID schoolUUID, List<UUID> courses) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.schoolUUID = schoolUUID;
        this.courses = courses;
    }
}
