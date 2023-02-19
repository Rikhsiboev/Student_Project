package com.cydeo;

import com.cydeo.entity.*;
import com.cydeo.service.CRUDService;
import com.cydeo.service.SchoolService;
import com.cydeo.service.*;

import java.util.Scanner;
import java.util.function.Consumer;

import static com.cydeo.DataGenerator.*;

import static com.cydeo.enums.DaysOfWeek.*;

public class SchoolMainRunner {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many Students you want to Generate?");
        int howManyStudents = input.nextInt();
        for (int i = 0; i < howManyStudents; i++) {
            Student student = generateStudent();
            Consumer<Student> s = p -> (new StudentService()).save(p);
            s.accept(student);
            System.out.println(student);
        }

        System.out.println("How many Courses you want to generate?");
        int howManyCourses = input.nextInt();
        for (int i = 0; i < howManyCourses; i++) {
            Course course = generateCourse();
            Consumer<Course> s = p -> (new CourseService()).save(p);
            s.accept(course);
            System.out.println(course);
        }

        boolean terminate = false;

        do {
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
