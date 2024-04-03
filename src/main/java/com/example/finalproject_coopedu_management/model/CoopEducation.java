package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "coop_educations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoopEducation {

    @Id
    private String coopEduId;
    private Date startDate;
    private Date endDate;
    private String coopEduType;
    private String status;
    private String coopEduYear;
    private String coopEduSemester;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId")
    private Company company;

}
