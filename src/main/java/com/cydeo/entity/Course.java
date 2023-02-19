package com.cydeo.entity;

import com.cydeo.enums.DaysOfWeek;
import lombok.*;

import java.util.UUID;


@Setter
@Getter
@ToString
public class Course extends BaseEntity{

    private String name;

    private Integer thresholdScore;

    private DaysOfWeek startedDay;

    public Course(UUID id, String name, Integer thresholdScore, DaysOfWeek startedDay) {
        super(id);
        this.name = name;
        this.thresholdScore = thresholdScore;
        this.startedDay = startedDay;
    }
}
