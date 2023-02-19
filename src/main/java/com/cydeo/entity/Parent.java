package com.cydeo.entity;

import lombok.*;

import java.util.UUID;


@Setter
@Getter
@ToString
public class Parent extends BaseEntity{

    private String firstName, lastName;

    public Parent(UUID id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
