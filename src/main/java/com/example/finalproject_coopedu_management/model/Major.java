package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "majors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Major {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long majorId;

    private String majorName;
    private String majorPhoneNo;
    private String majorFax;
    private String majorEmail;

}