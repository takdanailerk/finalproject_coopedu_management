package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyService {

    void addCompany (Company company);

}
