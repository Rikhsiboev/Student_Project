package com.cydeo.service;

import java.util.List;


// All method we have to write here as generic
public interface CRUDService<T> {

    T findById(int id);

    List<T> findAll();

    void save(T t);

    void update(T t);

    void deleteById(int id);

}

