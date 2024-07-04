package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Major;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MajorDaoImpl implements MajorDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Long addMajor(Major major) {
        Session session = sessionFactory.getCurrentSession();
        return (Long) session.save(major);
    }


//    @Override
//    public void addMajor(Major major) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(major);
//    }

    @Override
    public List<Major> getAllMajors(){
        Session session = sessionFactory.getCurrentSession();
        Query<Major> query = session.createQuery("FROM Major ", Major.class);
    return query.getResultList();
    }

    @Override
    public Major getMajorById(Long majorId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Major> query = session.createQuery("FROM Major WHERE majorId =: mId", Major.class);
        query.setParameter("mId", majorId);
        return query.getSingleResult();
    }

    @Override
    public void updateMajor(Major major) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(major);
    }

    @Override
    public void deleteMajor(Long majorId) {
    Session session = sessionFactory.getCurrentSession();
        Query<Major> query = session.createQuery("FROM Major WHERE majorId =: mId", Major.class);
        query.setParameter("mId", majorId);
        Major major = query.getSingleResult();
        session.delete(major);
    }

    @Override
    public Long getLatestMajorId() {
        Session session = sessionFactory.getCurrentSession();
        Query<Long> query = session.createQuery("SELECT MAX(m.id) FROM Major m", Long.class);
        return query.getSingleResult();
    }


}
