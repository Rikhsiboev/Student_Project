package com.cydeo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class BaseEntity {

    private int id;
    private int courseId;

    public BaseEntity(int courseId) {
        this.courseId = courseId;
    }
}
