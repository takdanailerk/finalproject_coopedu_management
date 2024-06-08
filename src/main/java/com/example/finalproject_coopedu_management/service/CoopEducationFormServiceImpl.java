package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.CompanyDao;
import com.example.finalproject_coopedu_management.model.Company;
import com.example.finalproject_coopedu_management.model.CoopEducation;
import com.example.finalproject_coopedu_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

@Service
public class CoopEducationFormServiceImpl implements CoopEducationFormService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private  CompanyService companyService;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private CoopEducationService coopEducationService;

    @Override
    @Transactional
    public void addCoopRequestForm(@RequestBody Map<String, String> json) {
        Student student = new Student(
                json.get("studentId"),
                json.get("studentName"),
                json.get("studentLastname"),
                json.get("studentPhoneNo"),
                json.get("studentEmail")
        );
        studentService.addStudent(student);

        Company company = new Company(
                null,//ทำให้เป็นการเพิ่มเลขแบบ auto เช่น CPN003
                json.get("companyName"),
                json.get("companyAddress"),
                json.get("companyPhoneNo"),
                json.get("companyEmail"),
                json.get("companyLine"),
                json.get("companyFacebook"),
                json.get("coordinatorName"),
                json.get("coordinatorPhoneNo")
        );
        Long companyId = companyService.addCompany(company);
        Company existCompany = companyService.getCompanyById(companyId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // รูปแบบวันที่ใน JSON

        LocalDate startDate = LocalDate.parse(json.get("startDate"), formatter);
        LocalDate endDate = LocalDate.parse(json.get("endDate"), formatter);

        CoopEducation coopEducation = new CoopEducation(
                null,//ทำให้เป็นการเพิ่มเลขแบบ auto เช่น COT003
                startDate,
                endDate,
                json.get("coopEduType"),
//                json.get("status"),
                json.get("coopEduYear"),
                json.get("coopEduSemester"),
                existCompany
//                companyId
//                json.get("majorId")
        );
        coopEducationService.addCoopEducation(coopEducation);
    }


}
