package com.cydeo.entity;

import lombok.*;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
public class Student extends BaseEntity{

    private String firstName, lastName;

    private List<UUID> parentUUID;

    public Student(UUID id, String firstName, String lastName, List<UUID> parentUUID) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentUUID = parentUUID;
    }
}
