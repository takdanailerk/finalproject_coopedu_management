package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    String addStudent (Student student);

//    void addStudent (Student student);
    List<Student> getAllStudents();
    Student getStudentById (String studentId);

}
