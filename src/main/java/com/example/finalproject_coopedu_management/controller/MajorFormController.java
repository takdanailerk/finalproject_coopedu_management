package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.model.Major;
import com.example.finalproject_coopedu_management.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MajorFormController {

    @Autowired
    private MajorService majorService;


    @RequestMapping("/major-form")
    public String goToMajorFormPage(){
        return "major-form";
    }

    @PostMapping(value = "/majors-form-submit")
    public String MajorFormSubmit(@RequestParam Map<String, String> json){
        majorService.addMajorForm(json);
        return "major-form";
    }

//    @GetMapping("/list-major")
//    public String ListMajorFormPage(Model model){
//        majorService.getAllMajors();
//        return "list-major";
//    }

//    @PutMapping("/{id}")
//    public String ShowUpdateMajorPage(@PathVariable Long majorId, Model model){
//        Major major = majorService.getMajorById(majorId);
//        model.addAttribute("major",major);
//        return "major-form";
//    }


    @GetMapping("/list-major")
    public String viewListMajors(Model model){
        model.addAttribute("majors", majorService.getAllMajors());
        return "list-major";
    }

    @GetMapping("/edit-major/{id}")
    public String showPageUpdateMajorForm(@PathVariable Long id,Model model){
        Major major = majorService.getMajorById(id);
        model.addAttribute("majors",major);
        return"edit-major-form";
    }

    @PostMapping(value = "/update-major/{id}")
    public String updateMajor(@PathVariable Long id, @ModelAttribute("majors") Major major){
        major.setMajorId(id);
        majorService.updateMajor(major);
        return "redirect:/list-major";
    }

    @GetMapping("/delete-major/{id}")
    public String deleteMajor(@PathVariable Long id){
        majorService.deleteMajor(id);
        return"redirect:/list-major";
    }

}
