package com.cydeo;

import com.cydeo.entity.*;
import com.cydeo.enums.DaysOfWeek;
import com.cydeo.service.CRUDService;
import com.cydeo.service.ParentService;
import net.datafaker.Faker;

import static com.cydeo.enums.DaysOfWeek.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    private final static Faker FAKER = new Faker();

    public static Student generateStudent(){
       var lastName = FAKER.name().lastName();
        return new Student(UUID.randomUUID(),FAKER.name().firstName(),lastName ,
                generateParent(lastName));

    }

    public static Course generateCourse(){
        int thresholdScore = (int)(Math.random()*10);
        DaysOfWeek day = (thresholdScore<2)?MONDAY:(thresholdScore<4)?TUESDAY:(thresholdScore<6)?WEDNESDAY:
                (thresholdScore<8)?THURSDAY:FRIDAY;
        return new Course(UUID.randomUUID(), FAKER.educator().course(),thresholdScore, day);

    }

    public static Parent generateParent(){
        return new Parent(UUID.randomUUID(),FAKER.name().firstName(),FAKER.name().firstName());
    }

    public static List<UUID> generateParent(String lastname){
        CRUDService<Parent> ParentService = new ParentService();
        Parent parent1 = generateParent();
        parent1.setLastName(lastname);
        Parent parent2 = generateParent();
        parent2.setLastName(lastname);
        ParentService.save(parent1);
        ParentService.save(parent2);
        return new ArrayList<>(Arrays.asList(parent1.getId(),parent2.getId()));
    }




}
