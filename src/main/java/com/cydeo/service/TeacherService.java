package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherService implements CRUDService<Teacher> {
    @Override
    public Teacher findById(int id) {
        return  Database.teacherList.stream().filter(teacher -> teacher.getId() == id).findFirst()
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
    };

    @Override
    public List<Teacher> findAll() {

        return Database.teacherList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(Teacher teacher) {
        Database.teacherList.add(teacher);
    }

    @Override
    public void update(Teacher teacher) {
      Database.teacherList.set(Database.teacherList.indexOf(teacher), teacher);
    }

    @Override
    public void deleteById(int id) {
       Database.teacherList.removeIf(teacher -> teacher.getId() == id);
    }
}
