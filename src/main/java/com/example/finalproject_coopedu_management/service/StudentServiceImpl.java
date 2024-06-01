package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.StudentDao;
import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}
