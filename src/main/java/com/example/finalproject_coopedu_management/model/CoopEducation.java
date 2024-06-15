package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "coop_educations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoopEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coopEduId;

    private String coopName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String coopEduType;
    private String status;
    private String coopEduYear;
    private String coopEduSemester;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId")
    private Company company;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "majorId")
    private Major major;



}
