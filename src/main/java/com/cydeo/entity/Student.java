package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
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
