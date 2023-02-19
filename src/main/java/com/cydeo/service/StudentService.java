package com.cydeo.service;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Student;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public class StudentService implements CRUDService<Student>{

    @Override
    public void save(Student entity) {

    }

    @Override
    public void update(UUID id, Student entity) throws InstanceNotFoundException {

    }

    @Override
    public void delete(UUID id) throws InstanceNotFoundException {

    }

    @Override
    public Student getById(UUID id) throws InstanceNotFoundException {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}
