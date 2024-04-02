package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "coopEducations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoopEducation {

    @Id
    private String coopId;
    private Date startDate;
    private Date returnDate;
    private String status;
    private String kindofworkName;
    private String coopYear;
    private String coopTerm;
//    private String fileRequestting;
//    private String fileReferral;
    private String fileName;
    private String fileResume;

}
