package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.CoopEducationDao;
import com.example.finalproject_coopedu_management.dao.MajorDao;
import com.example.finalproject_coopedu_management.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Service
public class CoopEducationFormServiceImpl implements CoopEducationFormService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private  CompanyService companyService;

//    @Autowired
//    private MajorService majorService;

    @Autowired
    private CoopEducationFormService coopEducationFormService;

    @Autowired
    private CoopEducationDao coopEducationDao;


    @Autowired
    private AcceptanceStatusService acceptanceStatusService;

    @Autowired
    private MajorDao majorDao;


    @Override
    @Transactional
    public void addCoopRequestForm(Long majorId, @RequestBody Map<String, String> json){
        Student student = new Student(
                json.get("studentId"),
                json.get("studentName"),
                json.get("studentLastname"),
                json.get("studentPhoneNo"),
                json.get("studentEmail")
        );
        String studentId = studentService.addStudent(student);
        Student existStudent = studentService.getStudentById(studentId);

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
                null,
                startDate,
                endDate,
                json.get("coopEduType"),
                null,
                json.get("coopEduYear"),
                json.get("coopEduSemester"),
                existCompany,
                majorDao.getMajorById(majorId)

        );
        Long coopEduId = coopEducationFormService.addCoopEducation(coopEducation);
        CoopEducation existCoopEducation = coopEducationFormService.getCoopEducationById(coopEduId);

        AcceptanceStatus acceptanceStatus = new AcceptanceStatus(
                null,
                null,
                existCoopEducation,
                existStudent
        );
        acceptanceStatusService.addAcceptStat(acceptanceStatus);

    }


    @Override
    @Transactional
    public Long addCoopEducation(CoopEducation coopEducation) {
        return coopEducationDao.addCoopEducation(coopEducation);
    }

    @Override
    @Transactional
    public List<CoopEducation> getAllCoopEducation() {
        return coopEducationDao.getAllCoopEducation();
    }

    @Override
    @Transactional
    public CoopEducation getCoopEducationById(Long coopEduId) {
        return coopEducationDao.getCoopEducationById(coopEduId);
    }

    @Override
    @Transactional
    public void updateRequestForm(CoopEducation coopEducation) {
        coopEducationDao.updateRequestForm(coopEducation);
    }

    @Override
    @Transactional
    public void deleteRequestForm(Long coopEduId) {
        coopEducationDao.deleteRequestForm(coopEduId);
    }



}
