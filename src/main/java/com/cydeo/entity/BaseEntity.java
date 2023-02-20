package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public abstract class BaseEntity {
    private int id;
    private int courseId;

    public BaseEntity(int courseId) {
        this.courseId = courseId;
    }
}
