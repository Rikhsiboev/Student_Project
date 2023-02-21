package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class CourseService implements CRUDService<Course> {


    @Override
    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId() == id)
                .findFirst().orElseThrow(() -> new NoSuchElementException("There is no match with this id " + id));
    }

    @Override
    public List<Course> findAll() {
        return Database.courseList;
    }

    @Override
    public void save(Course course) {
        Database.courseList.add(course);
    }

    @Override
    public void update(Course course) {
        Database.courseList.stream()
                .filter(p -> p.getId() == course.getId())
                .findFirst()
                .ifPresent(p -> {
                    p.setCourseName(course.getCourseName());
                    p.setThresholdScore(course.getThresholdScore());
                    p.setDaysOfWeek(course.getDaysOfWeek());

                });


    }

    @Override
    public void deleteById(int id) {
        Database.courseList = Database.courseList.stream()
                .filter(course -> course.getId() != id)
                .collect(Collectors.toList());

    }
}

