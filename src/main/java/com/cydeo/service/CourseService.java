package com.cydeo.service;


import com.cydeo.entity.Course;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

import static com.cydeo.database.Database.*;

public class CourseService implements CRUDService<Course> {

    @Override
    public List<Course> getAll() {
        return COURSE_LIST;
    }
    @Override
    public void save(Course course) {
        getAll().add(course);
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


}
