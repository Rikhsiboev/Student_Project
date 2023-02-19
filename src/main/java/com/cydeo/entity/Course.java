package com.cydeo.entity;

import com.cydeo.enums.DaysOfWeek;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Setter
@Getter
public class Course extends BaseEntity{

    private String name;

    private Integer thresholdScore;

    private DaysOfWeek createdDay;

    public Course(UUID id, String name, Integer thresholdScore, DaysOfWeek createdDay) {
        super(id);
        this.name = name;
        this.thresholdScore = thresholdScore;
        this.createdDay = createdDay;
    }
}
