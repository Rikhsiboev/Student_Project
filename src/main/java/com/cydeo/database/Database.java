package com.cydeo.database;

import com.cydeo.entity.Course;

import java.util.ArrayList;
import java.util.List;

import com.cydeo.entity.*;
import com.cydeo.enums.DaysOfWeek;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Database {


//    Initial data for Courses
    public static List<Course> courseList = new ArrayList<>(List.of(
            new Course(1,"English", 40, List.of(DaysOfWeek.MONDAY, DaysOfWeek.THURSDAY)),
            new Course(2,"Math",50, List.of(DaysOfWeek.values())),
            new Course(3,"Java",80, List.of(DaysOfWeek.WEDNESDAY))

    ));



//        Initial data for Parents
        public static List<Parent> parentList = new ArrayList<>(List.of(
            new Parent(1, "John", "Wayne"),
            new Parent(2, "Mike", "Junior")
    ));


//     Initial data for Students
    public static List<Student> studentList = new ArrayList<>(List.of(
            new Student(1, 12345L, "Jayne", "Smith", parentList.get(0),new School(), courseList),
            new Student(2, 12346L, "Candy", "Brown", parentList.get(1),new School(), courseList)

    ));

//    Initial data for Schools
    public static List<School> schoolList = new ArrayList<>(List.of(
            new School(1, "ABC_School", studentList, courseList),
            new School(2, "Java_School", studentList, courseList)
    ));

//    Initial data for teachers
    public static List<Teacher> teacherList = new ArrayList<>(List.of(
            new Teacher(1, "Michael", "Smith", "(212)456-7423)", BigDecimal.valueOf(100000),schoolList.get(0), courseList),
            new Teacher(2, "Mary", "Martinez", "(416)245-6369)", BigDecimal.valueOf(110000),schoolList.get(1), courseList)
    ));
}