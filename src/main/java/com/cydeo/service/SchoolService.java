package com.cydeo.service;

import static com.cydeo.database.Database.SCHOOL_LIST;

import com.cydeo.entity.School;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

public class SchoolService implements CRUDService<School> {


    public School findById(UUID id) throws InstanceNotFoundException {
        return findAll().stream()
                .filter(p -> p.getId().toString().equals(id.toString()))
                .findAny().orElseThrow(InstanceNotFoundException::new);
    }
    @Override
    public List<School> findAll() {
        return SCHOOL_LIST;
    }

    @Override
    public void save(School school) {
        findAll().add(school);
    }

    @Override
    public void update(School school) throws InstanceNotFoundException {
        if(findIndex(school.getId())>=0){
            findAll().set(findIndex(school.getId()),school);
        }else{
            throw new InstanceNotFoundException();
        }
    }


    @Override
    public void deleteById(UUID id) throws InstanceNotFoundException {
        if(findIndex(id)>=0){
            findAll().remove(findIndex(id));
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
