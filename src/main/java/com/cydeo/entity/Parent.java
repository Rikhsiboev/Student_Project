package com.cydeo.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Parent extends BaseEntity {


    private String firstName;
    private String lastName;


    public Parent(int id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
