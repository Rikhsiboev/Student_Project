package com.cydeo.service;

import com.cydeo.database.Static;
import com.cydeo.entity.Course;

import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherService implements CRUDService<Course> {
    @Override
    public Course findById(int id) {
        // Find the course with the matching ID using a stream
        return Static.COURSE_LIST.stream()
                .filter(course -> course.getId() == id)
                .findFirst() // returns an Optional<Course>
                .orElse(null); // return null if no course is found
    }

    public List<Course> findAll() {
        // Use a stream to return a list of all courses
        return Static.COURSE_LIST.stream()
                .collect(Collectors.toList());
    }

    @Override
    public void save(Course course) {
        Static.COURSE_LIST.add(course);
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void deleteById(int id) {
        // TODO: 2/19/2023 use stream if possible
        Static.COURSE_LIST.removeIf(c -> c.getId() == id);
    }
}
