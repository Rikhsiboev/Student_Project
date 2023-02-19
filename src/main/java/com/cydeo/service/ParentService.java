package com.cydeo.service;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Parent;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public class ParentService implements CRUDService<Parent>{

    @Override
    public boolean save(Parent entity) {
        return false;
    }

    @Override
    public void update(UUID id, Parent entity) throws InstanceNotFoundException {

    }

    @Override
    public void delete(UUID id) throws InstanceNotFoundException {

    }

    @Override
    public Parent getById(UUID id) throws InstanceNotFoundException {
        return null;
    }

    @Override
    public List<Parent> getAll() {
        return null;
    }
}
