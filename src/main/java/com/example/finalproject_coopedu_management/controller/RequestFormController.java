package com.example.finalproject_coopedu_management.controller;

import com.example.finalproject_coopedu_management.model.Company;
import com.example.finalproject_coopedu_management.model.CoopEducation;
import com.example.finalproject_coopedu_management.model.Major;
import com.example.finalproject_coopedu_management.model.Student;
import com.example.finalproject_coopedu_management.service.CompanyService;
import com.example.finalproject_coopedu_management.service.CoopEducationFormService;
import com.example.finalproject_coopedu_management.service.MajorService;
import com.example.finalproject_coopedu_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class RequestFormController {

    @Autowired
    private CoopEducationFormService coopEducationFormService;


    @Autowired
    private CompanyService companyService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/request-form")
    public String goToRequestFormPage(){
        return "request-form";
    }

    @PostMapping(value = "/request-form-submit")
    public String requestFormSubmit (@RequestParam("majorId") Long majorId,@RequestParam Map<String, String> json){
        coopEducationFormService.addCoopRequestForm(majorId,json);
        return "request-form";
    }


    @GetMapping("/list-request-form")
    public String viewListRequestFormPage(Model model){
        model.addAttribute("coop_educations",coopEducationFormService.getAllCoopEducation());
        return "list-request-form";
    }

    @GetMapping("/edit-request-form/{id}")
    public String showPageUpdateRequestForm(@PathVariable Long id,Model model){
        CoopEducation coopEducation = coopEducationFormService.getCoopEducationById(id);
        List<Major> majors = majorService.getAllMajors();  // ดึงข้อมูล Major ทั้งหมด
        List<Company> companies = companyService.getAllCompanies();  // ดึงข้อมูล Company ทั้งหมด

        model.addAttribute("majors", majors);
        model.addAttribute("companies", companies);
        model.addAttribute("coop_educations",coopEducation);
        return "update-request-form";
    }

    @PostMapping("update-request-form/{id}")
    public String updateRequestForm(@PathVariable Long id, @ModelAttribute("coop_educations") CoopEducation coopEducation){
        coopEducation.setCoopEduId(id);
        coopEducationFormService.updateRequestForm(coopEducation);
        return"redirect:/list-request-form";
    }

    @GetMapping("/delete-request-form/{id}")
    public String deleteRequestForm(@PathVariable Long id){
        coopEducationFormService.deleteRequestForm(id);
        return "redirect:/list-request-form";
    }

}
