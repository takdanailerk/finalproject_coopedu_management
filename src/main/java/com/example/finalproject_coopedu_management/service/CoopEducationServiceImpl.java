package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.CoopEducation;
import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
public class CoopEducationServiceImpl implements CoopEducationService {

    @Autowired
    private StudentService studentService;

    @Override
    @Transactional
    public void addCoopRequestForm(Map<String, String> json) {
        Student student = new Student(
                "STU001",
                json.get("studentName"),
                json.get("studentLastname"),
                json.get("studentPhoneNo"),
                json.get("studentEmail")
        );
        studentService.addStudent(student);
    }

}
