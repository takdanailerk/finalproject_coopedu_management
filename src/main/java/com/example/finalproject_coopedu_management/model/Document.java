package com.example.finalproject_coopedu_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//คือเอกสาร แบบประเมินที่อัพโหลดเข้ามา
public class Document {

    @Id
    private String docId;
    private String docName;
    private String uploadDate;
    private String doctype;
}
