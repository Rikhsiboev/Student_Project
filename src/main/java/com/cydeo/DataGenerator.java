package com.cydeo;

import com.cydeo.entity.*;
import com.cydeo.enums.DaysOfWeek;
import net.datafaker.Faker;

import static com.cydeo.enums.DaysOfWeek.*;

import java.util.UUID;

public class DataGenerator {

    private final static Faker FAKER = new Faker();

    public static Student generateStudent(){
       var lastName = FAKER.name().lastName();
        return new Student(UUID.randomUUID(),FAKER.name().firstName(),lastName ,
                new Parent(UUID.randomUUID(),FAKER.name().firstName(),lastName ));

    }

    public static Course generateCourse(){
        int thresholdScore = (int)(Math.random()*10);
        DaysOfWeek day = (thresholdScore<2)?MONDAY:(thresholdScore<4)?TUESDAY:(thresholdScore<6)?WEDNESDAY:
                (thresholdScore<8)?THURSDAY:FRIDAY;
        return new Course(UUID.randomUUID(), FAKER.educator().course(),thresholdScore, day);

    }




}
