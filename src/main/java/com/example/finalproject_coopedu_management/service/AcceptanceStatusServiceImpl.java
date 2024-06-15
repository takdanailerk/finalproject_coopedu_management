package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.AcceptanceStatusDao;
import com.example.finalproject_coopedu_management.model.AcceptanceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AcceptanceStatusServiceImpl implements AcceptanceStatusService{

    @Autowired
    private AcceptanceStatusDao acceptanceStatusDao;

    @Override
    @Transactional
    public List<AcceptanceStatus> getAllAcceptStatus() {
        return acceptanceStatusDao.getAllAcceptStatus();
    }

    @Override
    @Transactional
    public AcceptanceStatus getAcceptStatId(Long acceptStatId) {
        return acceptanceStatusDao.getAcceptStatId(acceptStatId);
    }

//    @Override
//    @Transactional
//    public Long addAcceptStat(AcceptanceStatus acceptanceStatus) {
//        return acceptanceStatusDao.addAcceptStat(acceptanceStatus);
//    }


    @Override
    @Transactional
    public void addAcceptStat(AcceptanceStatus acceptanceStatus) {
        acceptanceStatusDao.addAcceptStat(acceptanceStatus);
    }

    @Override
    @Transactional
    public void deleteAcceptStat(Long acceptStatId) {
        acceptanceStatusDao.deleteAcceptStat(acceptStatId);
    }

}
