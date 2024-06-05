package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.service.CoopEducationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class RequestFormController {

    @Autowired
    private CoopEducationFormService coopEducationService;


    @RequestMapping("/request-form")
    public String goToRequestFormPage(){
        return "request-form";
    }

    @PostMapping(value = "/request-form-submit")
    public String requestFormSubmit (@RequestParam Map<String, String> json){
        coopEducationService.addCoopRequestForm(json);
        return "request-form";
    }



}
