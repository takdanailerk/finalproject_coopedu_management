package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.CompanyDao;
import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    @Transactional
    public List<Company> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    @Transactional
    public Company getCompanyById(Long companyId) {
        return companyDao.getCompanyById(companyId);
    }

    @Override
    @Transactional
    public Long addCompany(Company company) {
        return companyDao.addCompany(company);
    }

    @Override
    @Transactional
    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }

    @Override
    @Transactional
    public void deleteCompany(Long companyId) {
        companyDao.deleteCompany(companyId);
    }




}

