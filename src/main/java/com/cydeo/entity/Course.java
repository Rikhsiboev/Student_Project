package com.cydeo.entity;

import com.cydeo.enums.DaysOfWeek;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Course extends BaseEntity {

    private String courseName;
    private int thresholdScore;
    private DaysOfWeek daysOfWeek;

    public Course(int courseId, String courseName, int thresholdScore, DaysOfWeek daysOfWeek) {
        super(courseId);
        this.courseName = courseName;
        this.thresholdScore = thresholdScore;
        this.daysOfWeek = daysOfWeek;
    }
}
