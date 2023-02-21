package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

    @Data
    @NoArgsConstructor
    public class Student extends BaseEntity {


        private Long studentNumber;
        private String fistName;
        private String lastName;
        private Parent parent;
        private School school;
        private List<Course> course;

        public Student(int id, Long studentNumber, String fistName, String lastName, Parent parent, School school, List<Course> course) {
            super(id);
            this.studentNumber = studentNumber;
            this.fistName = fistName;
            this.lastName = lastName;
            this.parent = parent;
            this.school = school;
            this.course = course;
        }
}
