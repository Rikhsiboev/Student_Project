package com.cydeo.entity;

import lombok.*;

import java.util.UUID;


@Getter
@Setter
@ToString
public class Student extends BaseEntity{

    private String firstName, lastName;

    private Parent parent;

    public Student(UUID id, String firstName, String lastName, Parent parent) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
    }
}
