package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@Data

public class School extends BaseEntity {

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


