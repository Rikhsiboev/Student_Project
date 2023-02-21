package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.School;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;


public class SchoolService implements CRUDService <School>{
    @Override
    public School findById(int id) throws InstanceNotFoundException {
        return Database.schoolList.stream()
                .filter(school -> school.getId() == id)
                .findFirst().orElseThrow (()-> new NoSuchElementException("No School With Matching ID --> " + id));
    }

    @Override
    public List<School> findAll() {
        return Database.schoolList;
    }

    @Override
    public void save(School school) {
        Database.schoolList.add(school);
    }

    @Override
    public void update(School school) throws InstanceNotFoundException {
deleteById(school.getId());
Database.schoolList.add(school);
    }

    @Override
    public void deleteById(int id) throws InstanceNotFoundException {
        School byId = findById(id);
        Database.schoolList.remove(byId);
    }



}
