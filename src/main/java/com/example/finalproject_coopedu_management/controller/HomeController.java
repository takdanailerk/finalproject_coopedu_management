package com.example.finalproject_coopedu_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goToHomePage () {
        return "home";
    }

}
