package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.StudentDao;
import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    @Transactional
    public String addStudent(Student student) {
        return studentDao.addStudent(student);
    }


//    @Override
//    @Transactional
//    public Long addStudent(Student student) {
//        return studentDao.addStudent(student);
//    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudentById(String studentId) {
        return studentDao.getStudentById(studentId);
    }

}
