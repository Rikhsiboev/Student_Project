package com.cydeo.service;


import com.cydeo.entity.Course;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public class CourseService implements CRUDService<Course> {

    @Override
    public void save(Course entity) {

    }

    @Override
    public void update(UUID id, Course entity) throws InstanceNotFoundException {

    }

    @Override
    public void delete(UUID id) throws InstanceNotFoundException {

    }

    @Override
    public Course getById(UUID id) throws InstanceNotFoundException {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }
}
