package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.Major;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorDao {

    Long addMajor(Major major);
//    void addMajor (Major major);
    List<Major>getAllMajors();
    Major getMajorById (Long majorId);
    void updateMajor(Major major);
    void deleteMajor(Long majorId);
    Long getLatestMajorId ();

}
