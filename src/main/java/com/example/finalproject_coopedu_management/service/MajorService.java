package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.Major;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
public interface MajorService {

    @Transactional
    void addMajorForm (Map<String, String> json);
    Long addMajor (Major major);
//    void addMajor (Major major);
    List<Major>getAllMajors();
    Major getMajorById (Long majorId);
    void updateMajor(Major major);
    void deleteMajor(Long majorId);



}
