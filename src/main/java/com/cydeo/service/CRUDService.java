package com.cydeo.service;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.School;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public interface CRUDService<T extends BaseEntity> {

    abstract void save(T entity);
    abstract void update(UUID id, T entity) throws InstanceNotFoundException;
    abstract void delete(UUID id) throws InstanceNotFoundException;
    abstract T getById(UUID id) throws InstanceNotFoundException;
    abstract List<T> getAll();
}
