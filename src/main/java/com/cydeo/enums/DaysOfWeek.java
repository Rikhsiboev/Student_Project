package com.cydeo.enums;

public enum DaysOfWeek {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday");
    public final String value;

    DaysOfWeek(String value) {
        this.value = value;
    }
}
