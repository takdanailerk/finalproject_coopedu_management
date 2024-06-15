package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.CoopEducation;
import com.example.finalproject_coopedu_management.model.Major;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoopEducationDao {

//    void addCoopEducation (CoopEducation coopEducation);
    Long addCoopEducation (CoopEducation coopEducation);
    List<CoopEducation> getAllCoopEducation();
    CoopEducation getCoopEducationById(Long coopEduId);
    void updateRequestForm(CoopEducation coopEducation);
    void deleteRequestForm(Long coopEduId);


//    List<Major>getAllMajors();
}
