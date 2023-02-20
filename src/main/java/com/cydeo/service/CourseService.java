package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;

import java.util.List;
import java.util.NoSuchElementException;

public class CourseService implements CRUDService<Course> {


    @Override
    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Course not found"));
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
