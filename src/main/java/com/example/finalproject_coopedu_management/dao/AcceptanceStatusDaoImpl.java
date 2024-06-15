package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.AcceptanceStatus;
import com.example.finalproject_coopedu_management.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AcceptanceStatusDaoImpl implements AcceptanceStatusDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<AcceptanceStatus> getAllAcceptStatus() {
        Session session = sessionFactory.getCurrentSession();
        Query<AcceptanceStatus> query = session.createQuery("FROM AcceptanceStatus", AcceptanceStatus.class);
        return query.getResultList();
    }

    @Override
    public AcceptanceStatus getAcceptStatId(Long acceptStatId) {
        Session session = sessionFactory.getCurrentSession();
        Query<AcceptanceStatus> query = session.createQuery("FROM AcceptanceStatus WHERE acceptStatId =: acsId", AcceptanceStatus.class);
        query.setParameter("acsId",acceptStatId);
        return query.getSingleResult() ;
    }

//    @Override
//    public Long addAcceptStat(AcceptanceStatus acceptanceStatus) {
//        Session session = sessionFactory.getCurrentSession();
//        return (Long) session.save(acceptanceStatus);
//    }

    @Override
    public void addAcceptStat(AcceptanceStatus acceptanceStatus) {
        Session session = sessionFactory.getCurrentSession();
        acceptanceStatus.setAcceptStatus("ร้องขอความอนุเคราะห์");
        session.save(acceptanceStatus);
    }

    @Override
    public void deleteAcceptStat(Long acceptStatId) {
        Session session = sessionFactory.getCurrentSession();
        Query<AcceptanceStatus> query = session.createQuery("FROM AcceptanceStatus WHERE acceptStatId =: acsId", AcceptanceStatus.class);
        query.setParameter("acsId",acceptStatId);
        AcceptanceStatus acceptanceStat = query.getSingleResult();
        session.delete(acceptanceStat);
    }

}
