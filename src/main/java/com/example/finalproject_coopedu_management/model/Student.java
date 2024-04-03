package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentId;
    private String studentName;
    private String studentLastname;
    private String studentPhoneNo;
    private String studentEmail;

}
