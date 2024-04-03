package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    private String companyId;
    private String companyName;
    private String companyAddress;
    private String companyPhoneNo;
    private String companyEmail;
    private String companyLine;
    private String companyFacebook;
    private String coordinatorName;
    private String coordinatorPhoneNo;

}
