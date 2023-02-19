package com.cydeo.service;

import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Student;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.UUID;

import static com.cydeo.database.Database.*;

public class StudentService implements CRUDService<Student>{

    @Override
    public List<Student> getAll() {
        return STUDENT_LIST;
    }
    @Override
    public boolean save(Student student) {
        return getAll().add(student);
    }

    @Override
    public void update(UUID id, Student student) throws InstanceNotFoundException {
        if(findIndex(id)>=0){
            getAll().set(findIndex(id),student);
        }else{
            throw new InstanceNotFoundException();
        }
    }

    @Override
    public void delete(UUID id) throws InstanceNotFoundException {

    }

    @Override
    public Student getById(UUID id) throws InstanceNotFoundException {
        return null;
    }
    private static int findIndex(UUID id){
        int index = -1;
        for (int i = 0; i < STUDENT_LIST.size(); i++) {
            if(STUDENT_LIST.get(i).getId().toString().equals(id.toString())){
                index=i;
                break;
            }
        }
        return index;
    }


}
