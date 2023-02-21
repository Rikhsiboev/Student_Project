package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;

import java.util.List;
import java.util.NoSuchElementException;

public class ParentService implements CRUDService<Parent> {


    @Override
    public Parent findById(int id) {
        return Database.parentList.stream()
                .filter(parent -> parent.getId() == id)
                .findFirst().orElseThrow(() -> new NoSuchElementException("No Parent With Matching ID --> " + id));

    }

    @Override
    public List<Parent> findAll() {
        return Database.parentList;
    }

    @Override
    public void save(Parent parent) {
        Database.parentList.add(parent);
    }

    @Override
    public void update(Parent parent) {
        deleteById(parent.getId());
        Database.parentList.add(parent);
    }

    @Override
    public void deleteById(int id) {
        Parent byId = findById(id);
        Database.parentList.remove(byId);

    }
}
