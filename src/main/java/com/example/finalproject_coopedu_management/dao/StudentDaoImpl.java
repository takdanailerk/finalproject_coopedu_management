package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;



//    @Override
//    public void addStudent(Student student) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(student);
//    }


    @Override
    public String addStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        return (String) session.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("FROM Student ",Student.class);
        return query.getResultList();
    }

    @Override
    public Student getStudentById(String studentId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("FROM Student WHERE studentId =: stuId",Student.class);
        query.setParameter("stuId", studentId);
        return query.getSingleResult();
    }



}
