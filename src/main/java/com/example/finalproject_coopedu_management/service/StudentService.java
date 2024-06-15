package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentService {

    String addStudent (Student student);
//    Long addStudent (Student student);
    List<Student> getAllStudents();
    Student getStudentById (String studentId);

}
