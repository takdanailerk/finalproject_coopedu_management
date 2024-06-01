package com.example.finalproject_coopedu_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestFormController {

    @RequestMapping("/request-form")
    public String goToRequestFormPage(){
        return "request-form";
    }


}
