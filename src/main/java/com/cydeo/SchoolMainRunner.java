package com.cydeo;

import com.cydeo.entity.*;
import com.cydeo.service.CRUDService;
import com.cydeo.service.*;


import java.util.Scanner;
import java.util.UUID;
import java.util.function.Consumer;

import static com.cydeo.DataGenerator.*;

public class SchoolMainRunner {


    public static void main(String[] args) {

        CRUDService<Student> studentService = new StudentService();
        CRUDService<Course> courseService = new CourseService();


        Scanner input = new Scanner(System.in);

        System.out.println("How many Students you want to Generate?");
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

        do {
            System.out.println("What do you want to do?");
            System.out.println("1.Add Student\n"+
                    "2.Add Course\n"+
                    "3.Add School\n"+
                    "4.Update Student\n"+
                    "5.Update Course\n"+
                    "6.Update School\n"+
                    "7.Delete Student\n"+
                    "8.Delete Course\n"+
                    "9.Delete School\n"+
                    "0.Exit\n");
            int select = input.nextInt();
            switch (select){
                case 1:
                    do {
                        System.out.println("Provide student information:");
                        System.out.print("Student First Name:");
                        String firstNameStudent = input.next();
                        System.out.print("Student Last Name:");
                        String lastNameStudent = input.next();
                        System.out.print("Parent First Name:");
                        String firstNameParent = input.next();
                        int check = studentService.getAll().size();
                        studentService.save(new Student(UUID.randomUUID(), firstNameStudent, lastNameStudent, new Parent(UUID.randomUUID(), firstNameParent, lastNameStudent)));
                        if (++check == studentService.getAll().size())
                            System.out.println("Success");
                        System.out.println("Would you like to add more students? 1-yes 0-no");
                    }while (input.nextInt()==1);break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:terminate=true;break;
            }
        }while (!terminate);


    }
}
