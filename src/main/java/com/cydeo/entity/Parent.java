package com.cydeo.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data

public class Parent extends BaseEntity {


    private String firstName;
    private String lastName;

    List<Parent> parentList = new ArrayList<>(); // <- Dynamic Parent LIST (?)


    public Parent(int id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
