package com.example.finalproject_coopedu_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
