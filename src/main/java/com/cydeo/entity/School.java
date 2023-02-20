package com.cydeo.entity;


import lombok.*;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
public class School extends BaseEntity{

    private String name;

    private List<UUID> studentsUUID;

    private List<UUID> coursesUUID;

    private List<UUID> teachersUUID;

    public School(UUID id, String name, List<UUID> studentsUUID, List<UUID> coursesUUID, List<UUID> teachersUUID) {
        super(id);
        this.name = name;
        this.studentsUUID = studentsUUID;
        this.coursesUUID = coursesUUID;
        this.teachersUUID = teachersUUID;
    }
}
