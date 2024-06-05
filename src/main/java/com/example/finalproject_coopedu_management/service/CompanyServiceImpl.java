package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.CompanyDao;
import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyDao companyDao;

    @Override
    @Transactional
    public void addCompany(Company company){
        companyDao.addCompany(company);
    }


}
