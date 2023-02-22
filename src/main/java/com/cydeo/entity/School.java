package com.cydeo.entity;

import lombok.Data;

import java.util.List;

@Data
public class School extends BaseEntity{

    private String name;

    private List<Student> students;

    private List<Course> courses;

    public School(int id, String name, List<Student> students, List<Course> courses) {
        super(id);
        this.name = name;
        this.students = students;
        this.courses = courses;
    }
}
