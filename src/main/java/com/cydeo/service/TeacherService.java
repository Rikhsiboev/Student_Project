package com.cydeo.service;

import com.cydeo.entity.Teacher;

import java.util.List;

public class TeacherService implements CRUDService<Teacher> {
    @Override
    public Teacher findById(int id) {
        // TODO: 2/19/2023 use stream if possible
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        // TODO: 2/19/2023 use stream if possible
        return null;
    }

    @Override
    public void save(Teacher teacher) {
        // TODO: 2/19/2023 use stream if possible

    }

    @Override
    public void update(Teacher teacher) {
        // TODO: 2/19/2023 use stream if possible
    }

    @Override
    public void deleteById(int id) {
        // TODO: 2/19/2023 use stream if possible
    }
}
