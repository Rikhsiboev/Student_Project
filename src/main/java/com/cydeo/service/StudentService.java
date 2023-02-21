package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;


public class StudentService implements CRUDService<Student> {


    @Override
    public Student findById(int id) {
        return Database.studentList.stream().filter(student -> student.getId() == id).findFirst().
                orElseThrow(() -> new NoSuchElementException("No Student with Matching ID: " + id));
    }

    @Override
    public List<Student> findAll() {
        return Database.studentList;
    }

    @Override
    public void save(Student student) {
        Database.studentList.add(student);
    }

    @Override
    public void update(Student student) {
        //Database.studentList.stream().filter(student1 -> student1.getId()==student.getId()   }

        Student s = Database.studentList.stream().filter(student1 ->
                student1.getId() == student.getId()).findFirst().get();
        Database.studentList.remove(s);
        Database.studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        Student s = Database.studentList.stream().filter(student -> student.getId() == id).
                findFirst().orElseThrow(() ->
                        new NoSuchElementException("No Student With Matching ID --> " + id));
        Database.studentList.remove(s);
    }
}






