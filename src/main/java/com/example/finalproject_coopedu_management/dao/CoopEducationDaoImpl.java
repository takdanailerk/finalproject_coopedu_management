package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.CoopEducation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoopEducationDaoImpl implements CoopEducationDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCoopEducation(CoopEducation coopEducation){
        Session session = sessionFactory.getCurrentSession();
        session.save(coopEducation);
    }

}
