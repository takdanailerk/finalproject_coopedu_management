package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.service.CompanyService;
import com.example.finalproject_coopedu_management.service.CoopEducationFormService;
import com.example.finalproject_coopedu_management.service.MajorService;
import com.example.finalproject_coopedu_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CoopEducationFormService coopEducationFormService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private MajorService majorService;

    @RequestMapping("/")
    public String goToHomePage () {
        return "home";
    }

    @GetMapping("/home")
    public String ToHomPage(){
        return "home";
    }

    //AddCoopedu
    @GetMapping("/request-form")
    public String goToRequestFormPage (Model model) {
//        model.addAttribute("companies", companyService.getAllCompanies());
//        model.addAttribute("coopEducations", coopEducationFormService.getAllCoopEducation());
//        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("majors", majorService.getAllMajors());
        return "request-form";
    }


    @GetMapping("/referral-form")
    public String goToReferralFormPage () {
        return "referral-form";
    }

//    //listCoopedu
//    @GetMapping("/list-request-form")
//    public String goToListRequestFrom(){
//        return "list-request-form";
//    }

    @GetMapping("/list-referral-form")
    public String goToListReferralForm(){
        return "list-referral-form";
    }

    @GetMapping("/view-status")
    public String goToViewStatus(){
        return "/view-status";
    }

    @GetMapping("/major-form")
    public String goToAddMajorForm(){
        return "major-form";
    }
}
