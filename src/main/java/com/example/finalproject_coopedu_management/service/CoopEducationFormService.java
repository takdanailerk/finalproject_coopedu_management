package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.CoopEducation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Repository
public interface CoopEducationFormService {

    @Transactional
    void addCoopRequestForm(Long majorId, @RequestBody Map<String, String> json);


//    void addCoopEducation (CoopEducation coopEducation);
    Long addCoopEducation (CoopEducation coopEducation);
    List<CoopEducation> getAllCoopEducation();
    CoopEducation getCoopEducationById(Long coopEduId);
    void updateRequestForm(CoopEducation coopEducation);
    void deleteRequestForm(Long coopEduId);

//    List<Major> getAllMajors();

}

