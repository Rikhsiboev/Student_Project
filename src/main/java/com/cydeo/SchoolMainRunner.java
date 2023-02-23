package com.cydeo;


import com.cydeo.entity.*;
import com.cydeo.service.*;

public class SchoolMainRunner {

    public static void main(String[] args) {
         CRUDService<Course> courseService = new CourseService();
         CRUDService<Parent> parentService = new ParentService();
         CRUDService<School> schoolService = new SchoolService();
         CRUDService<Student> studentService = new StudentService();
         CRUDService<Teacher> teacherService= new TeacherService();
    }
}
