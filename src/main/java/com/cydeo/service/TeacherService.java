package com.cydeo.service;

import com.cydeo.entity.Course;

import java.util.List;

public class TeacherService implements CRUDService<Course> {
    @Override
    public Course findById(int id) {
        // TODO: 2/19/2023 use stream if possible
        return null;
    }

    @Override
    public List<Course> findAll() {
        // TODO: 2/19/2023 use stream if possible
        return null;
    }

    @Override
    public void save(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void deleteById(int id) {
        // TODO: 2/19/2023 use stream if possible
    }
}