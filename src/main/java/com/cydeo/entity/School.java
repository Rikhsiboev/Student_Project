package com.cydeo.entity;


import lombok.*;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
public class School extends BaseEntity{

    private String name;

    private List<Student> students;

    private List<Student> courses;

    public School(UUID id, String name, List<Student> students, List<Student> courses) {
        super(id);
        this.name = name;
        this.students = students;
        this.courses = courses;
    }
}
