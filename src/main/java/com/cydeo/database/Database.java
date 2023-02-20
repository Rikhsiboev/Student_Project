package com.cydeo.database;

import com.cydeo.entity.Course;
import com.cydeo.enums.DaysOfWeek;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Course> courseList = new ArrayList<>(List.of(
            new Course(1,"English", 40, List.of(DaysOfWeek.MONDAY, DaysOfWeek.THURSDAY)),
            new Course(2,"Math",50, List.of(DaysOfWeek.values())),
            new Course(3,"Java",80, List.of(DaysOfWeek.WEDNESDAY))

    ));

}
