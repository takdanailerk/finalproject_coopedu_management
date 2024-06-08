package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

//    @Autowired
//    private CoopEducationService coopEducationService;

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/")
    public String goToHomePage () {
        return "home";
    }

    @GetMapping("/home")
    public String ToHomPage(){
        return "/home";
    }

    //AddCoopedu
    @GetMapping("/request-form")
    public String goToRequestFormPage (Model model) {
        model.addAttribute("majors", companyService.getAllCompanies());
        return "request-form";
    }

//    @PostMapping(value = "/request-form-submit")
//    public String requestFormSubmit (@RequestParam Map<String, String> json) {
//        coopEducationService.addCoopRequestForm(json);
//        return "request-form";
//    }

    @GetMapping("/referral-form")
    public String goToReferralFormPage () {
        return "referral-form";
    }


    //listCoopedu
    @GetMapping("/list-request-form")
    public String goToListRequestFrom(){
        return "list-request-form";
    }
    @GetMapping("/list-referral-from")
    public String goToListReferralForm(){
        return "list-referral-from";
    }

    @GetMapping("/view-status")
    public String goToViewStatus(){
        return "/view";
    }



}
