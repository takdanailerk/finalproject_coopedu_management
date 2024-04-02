package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentId;
    private String StudentName;
    private String studentLastname;
    private String studentPhoneNO;
    private String studentEmail;
}
