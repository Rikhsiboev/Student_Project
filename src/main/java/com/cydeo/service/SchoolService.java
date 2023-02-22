package com.cydeo.service;

import com.cydeo.entity.School;

import static com.cydeo.database.Database.*;

import java.util.List;
import java.util.NoSuchElementException;

public class SchoolService implements CRUDService<School>{


    public School findById(int id){
        return findAll().stream()
                .filter(p -> p.getId()==id)
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<School> findAll() {
        return schoolList;
    }

    @Override
    public void save(School school) {
        findAll().add(school);
    }


    @Override
    public void update(School school) {
        findAll().set(
                findAll().indexOf(findById(school.getId())), school);
    }

    @Override
    public void deleteById(int id){
        findAll().remove(findById(id));
    }

}