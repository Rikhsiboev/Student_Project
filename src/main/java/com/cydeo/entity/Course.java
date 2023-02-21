package com.cydeo.entity;

import com.cydeo.enums.DaysOfWeek;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Course extends BaseEntity {

    private String courseName;
    private int thresholdScore;
    private List<DaysOfWeek> daysOfWeek;

    public Course(int courseId, String courseName, int thresholdScore, List<DaysOfWeek> daysOfWeek) {
        super(courseId);
        this.courseName = courseName;
        this.thresholdScore = thresholdScore;
        this.daysOfWeek = daysOfWeek;
    }
}
