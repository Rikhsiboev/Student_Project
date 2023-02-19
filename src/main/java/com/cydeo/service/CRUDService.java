package com.cydeo.service;

import java.util.List;

public interface CRUDService<T>{

    T findById(int id);

    List<T> findAll();

    void save(T t);

    void update(T t);

    void deleteById(int id);

}
