package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    @Id
    private String staffId;
    private String staffName;
    private String staffSurname;
    private String staffPhoneNO;
    private String staffEmail;
    private String role;
    private String username;
    private String password;
}
