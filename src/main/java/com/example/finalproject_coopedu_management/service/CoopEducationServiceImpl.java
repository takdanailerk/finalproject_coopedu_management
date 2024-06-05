package com.example.finalproject_coopedu_management.service;


import com.example.finalproject_coopedu_management.dao.CoopEducationDao;
import com.example.finalproject_coopedu_management.model.CoopEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoopEducationServiceImpl implements CoopEducationService{

    @Autowired
    private CoopEducationDao coopEducationDao;

    @Override
    @Transactional
    public void addCoopEducation(CoopEducation coopEducation){
        coopEducationDao.addCoopEducation(coopEducation);
    }

}
