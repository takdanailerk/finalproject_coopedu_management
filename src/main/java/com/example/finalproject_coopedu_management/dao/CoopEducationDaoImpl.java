package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.CoopEducation;

import com.example.finalproject_coopedu_management.model.Major;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CoopEducationDaoImpl implements CoopEducationDao{

    @Autowired
    private SessionFactory sessionFactory;


//    @Override
//    public void addCoopEducation(CoopEducation coopEducation){
//        Session session = sessionFactory.getCurrentSession();
//        coopEducation.setStatus("รอการจัดส่งเอกสาร");
//        session.save(coopEducation);
//    }


    @Override
    public Long addCoopEducation(CoopEducation coopEducation){
        Session session = sessionFactory.getCurrentSession();
        coopEducation.setStatus("รอการจัดส่งเอกสาร");
        coopEducation.setCoopName("ขอความอนุเคราะห์");
        return (Long) session.save(coopEducation);
    }


    @Override
    public List<CoopEducation> getAllCoopEducation() {
        Session session = sessionFactory.getCurrentSession();
        Query<CoopEducation> query = session.createQuery("FROM CoopEducation ",CoopEducation.class);
        return query.getResultList();
    }

    @Override
    public CoopEducation getCoopEducationById(Long coopEduId) {
        Session session = sessionFactory.getCurrentSession();
        Query<CoopEducation> query = session.createQuery("SELECT ce FROM CoopEducation ce JOIN ce.company co JOIN ce.major m WHERE  ce.coopEduId = :copId",CoopEducation.class);
        query.setParameter("copId",coopEduId);
        return query.getSingleResult();
    }

    @Override
    public void updateRequestForm(CoopEducation coopEducation) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(coopEducation);
    }

    @Override
    public void deleteRequestForm(Long coopEduId) {
        Session session = sessionFactory.getCurrentSession();
        Query<CoopEducation> query = session.createQuery("SELECT ce FROM CoopEducation ce JOIN ce.company co JOIN ce.major m WHERE  ce.coopEduId = :copId",CoopEducation.class);
        query.setParameter("copId",coopEduId);
        CoopEducation coopEducation = query.getSingleResult();
        session.delete(coopEducation);
    }

}
