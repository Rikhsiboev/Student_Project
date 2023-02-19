package com.cydeo.service;

import static com.cydeo.database.Database.*;
import com.cydeo.entity.School;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public class SchoolService implements CRUDService<School>{


    @Override
    public List<School> getAll() {
        return SCHOOL_LIST;
    }

    public School getById(UUID id) throws InstanceNotFoundException {
        return getAll().stream()
                .filter(p -> p.getId().toString().equals(id.toString()))
                .findAny().orElseThrow(InstanceNotFoundException::new);
    }

    @Override
    public void save(School school) {
        getAll().add(school);
    }

    @Override
    public void update(UUID id ,School school) throws InstanceNotFoundException {
        if(findIndex(id)>=0){
            getAll().set(findIndex(id),school);
        }else{
            throw new InstanceNotFoundException();
        }
    }

    @Override
    public void delete(UUID id) throws InstanceNotFoundException {
        if(findIndex(id)>=0){
            getAll().remove(findIndex(id));
        }else{
            throw new InstanceNotFoundException();
        }
    }

    private static int findIndex(UUID id){
        int index = -1;
        for (int i = 0; i < SCHOOL_LIST.size(); i++) {
            if(SCHOOL_LIST.get(i).getId().toString().equals(id.toString())){
                index=i;
                break;
            }
        }
        return index;
    }
}
