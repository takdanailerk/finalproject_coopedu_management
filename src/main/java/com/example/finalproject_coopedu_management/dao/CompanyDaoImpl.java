package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CompanyDaoImpl implements CompanyDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Company> getAllCompanies () {
        Session session = sessionFactory.getCurrentSession();
        Query<Company> query = session.createQuery("FROM Company", Company.class);
        return query.getResultList();
    }

    //Get by id
    @Override
    public Company getCompanyById(Long companyId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Company> query = session.createQuery("FROM Company WHERE companyId =: cId", Company.class);
        query.setParameter("cId", companyId);
        return query.getSingleResult();
    }

    //Create
    @Override
    public Long addCompany(Company company) {
        Session session = sessionFactory.getCurrentSession();
        return (Long) session.save(company);
    }

    //Update
    @Override
    public void updateCompany(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.update(company);
    }

    //Delete
    @Override
    public void deleteCompany(Long companyId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Company> query = session.createQuery("FROM Company WHERE companyId =: cId", Company.class);
        query.setParameter("cId", companyId);
        Company company = query.getSingleResult();
        session.delete(company);
    }

}
