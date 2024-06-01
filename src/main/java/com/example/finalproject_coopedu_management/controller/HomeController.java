package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.service.CoopEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private CoopEducationService coopEducationService;

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
    public String goToRequestFormPage () {
        return "request-form";
    }

    @PostMapping(value = "/request-form-submit")
    public String requestFormSubmit (@RequestParam Map<String, String> json) {
        coopEducationService.addCoopRequestForm(json);
        return "request-form";
    }

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
