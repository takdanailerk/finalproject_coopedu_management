package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao  {

    void addCompany (Company company);

}
