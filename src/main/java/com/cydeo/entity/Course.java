package com.cydeo.entity;

import com.cydeo.enums.DaysOfWeek;

import java.util.List;

public class Course extends BaseEntity {
    private int id;
    private String name;
    private int price;
    private List<DaysOfWeek> weekDays;

    public Course(int id, String name, int price, List<DaysOfWeek> weekDays) {
    }
}
