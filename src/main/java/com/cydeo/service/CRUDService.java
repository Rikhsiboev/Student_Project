package com.cydeo.service;

import com.cydeo.entity.BaseEntity;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

// All method we have to write here as generic
public interface CRUDService<T extends BaseEntity> {
    T findById(UUID id) throws InstanceNotFoundException;

    List<T> findAll();

    void save(T t);

    void update(T t) throws InstanceNotFoundException;

    void deleteById(UUID id) throws InstanceNotFoundException;

}

