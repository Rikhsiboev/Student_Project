package com.cydeo.enums;

public enum DaysOfWeek {

    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),
    THURSDAY("Thursday") , FRIDAY("Friday");

    String value;

    DaysOfWeek(String str) {
        this.value = str;
    }
}
