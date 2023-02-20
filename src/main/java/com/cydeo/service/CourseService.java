package com.cydeo.service;

import com.cydeo.entity.Course;

import java.util.List;

import static com.cydeo.database.Database.COURSE_LIST;

public class CourseService implements CRUDService<Course> {

    public List<Course> getAll(){
        return COURSE_LIST;
    }


    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
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

    }
}
