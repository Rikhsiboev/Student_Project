package com.cydeo;

import com.cydeo.entity.*;
import com.cydeo.enums.DaysOfWeek;
import com.cydeo.service.CRUDService;
import com.cydeo.service.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;
import java.util.function.Consumer;

import static com.cydeo.DataGenerator.*;
import static com.cydeo.enums.DaysOfWeek.*;

public class SchoolMainRunner {


    public static void main(String[] args) {

        CRUDService<Student> studentService = new StudentService();
        CRUDService<Course> courseService = new CourseService();
        CRUDService<School> schoolService = new SchoolService();
        CRUDService<Parent> parentService = new ParentService();


        Scanner input = new Scanner(System.in);

        System.out.println("How many Students with parents you want to Generate?");
        int howManyStudents = input.nextInt();
        for (int i = 0; i < howManyStudents; i++) {
            Student student = generateStudent();
            Consumer<Student> s = studentService::save;
            s.accept(student);
            System.out.println(student);
        }

        System.out.println("How many Courses you want to generate?");
        int howManyCourses = input.nextInt();
        for (int i = 0; i < howManyCourses; i++) {
            Course course = generateCourse();
            Consumer<Course> s = courseService::save;
            s.accept(course);
            System.out.println(course);
        }

        boolean terminate = false;
        boolean isSucsessful = false;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1.Add Student\n" +
                    "2.Add Course\n" +
                    "3.Add School\n" +
                    "4.Update Student\n" +
                    "5.Update Course\n" +
                    "6.Update School\n" +
                    "7.Delete Student\n" +
                    "8.Delete Course\n" +
                    "9.Delete School\n" +
                    "0.Exit\n");
            int select = input.nextInt();
            switch (select) {
                //Add Course
                case 1:
                    do {
                        System.out.println("Provide student information:");
                        System.out.print("Student First Name:");
                        String firstNameStudent = input.next();
                        System.out.print("Student Last Name:");
                        String lastNameStudent = input.next();
                        System.out.print("Parent 1 First Name:");
                        String firstNameParent1 = input.next();
                        System.out.print("Parent 2 First Name:");
                        String firstNameParent2 = input.next();
                        Parent paren1 = new Parent(UUID.randomUUID(),firstNameParent1,lastNameStudent);
                        Parent paren2 = new Parent(UUID.randomUUID(),firstNameParent2,lastNameStudent);
                        isSucsessful = false;
                        isSucsessful = studentService.save(new Student(UUID.randomUUID(), firstNameStudent, lastNameStudent,
                                Arrays.asList(paren1.getId(),paren2.getId())));
                        if (isSucsessful)
                            System.out.println("Success");
                        System.out.println("Would you like to add more students? 1-yes 0-no");
                    } while (input.nextInt() == 1);
                    break;
                //Add Course
                case 2:
                    do {
                        System.out.println("Provide course information:");
                        System.out.print("Course Name:");
                        String NameCourse = input.next();
                        System.out.print("Threshold Score:");
                        int thresholdScoreCourse = input.nextInt();
                        System.out.print("Started Day: 1-Monday 2-Tuesday 3-Wednesday 4-Thursday 5-Friday");
                        int selectDay = input.nextInt();
                        DaysOfWeek day = (selectDay == 1) ? MONDAY : (selectDay == 2) ? TUESDAY : (selectDay == 3) ? WEDNESDAY :
                                (selectDay == 4) ? THURSDAY : FRIDAY;
                        isSucsessful = false;
                        isSucsessful = courseService.save(new Course(UUID.randomUUID(), NameCourse, thresholdScoreCourse, day));
                        if (isSucsessful)
                            System.out.println("Success");
                        System.out.println("Would you like to add more students? 1-yes 0-no");
                    } while (input.nextInt() == 1);
                    break;
                    //Add School
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    terminate = true;
                    break;
            }
        } while (!terminate);


    }
    //avaliable students();
}
