package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDaoImpl implements CompanyDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCompany(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.save(company);
    }

}
