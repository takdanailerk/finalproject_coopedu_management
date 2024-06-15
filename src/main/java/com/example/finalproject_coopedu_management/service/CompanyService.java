package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyService {

    Company getCompanyById (Long companyId);
    Long addCompany (Company company);
    List<Company> getAllCompanies ();
    void updateCompany (Company company);
    void deleteCompany (Long companyId);

}
