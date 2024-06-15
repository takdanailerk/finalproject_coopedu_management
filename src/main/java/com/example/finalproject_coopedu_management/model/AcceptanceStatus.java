package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "acceptance_status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcceptanceStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acceptStatId;

    private String acceptStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coopEduId")
    private CoopEducation coopEducation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentId")
    private Student student;

}
