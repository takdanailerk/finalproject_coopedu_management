package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.dao.MajorDao;
import com.example.finalproject_coopedu_management.model.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Service
public class MajorServiceImpl implements MajorService{

    @Autowired
    private MajorDao majorDao;

    @Autowired
    private MajorService majorService;

    @Override
    @Transactional
    public void addMajorForm(@RequestBody Map<String, String> json) {
        Major major = new Major(
                2l,
                json.get("majorName"),
                json.get("majorPhoneNo"),
                json.get("majorFax"),
                json.get("majorEmail")
        );
        majorService.addMajor(major);

//        Long majorId = majorService.addMajor(major);
//        Major existMajor = majorService.getMajorById(majorId);

    }


//    @Override
//    @Transactional
//    public void addMajor(Major major) {
//        majorDao.addMajor(major);
//    }

    @Override
    @Transactional
    public Long addMajor(Major major) {
        return majorDao.addMajor(major);
    }

    @Override
    @Transactional
    public List<Major> getAllMajors() {
        return majorDao.getAllMajors();
    }

    @Override
    @Transactional
    public Major getMajorById(Long majorId) {
        return majorDao.getMajorById(majorId);
    }

    @Override
    @Transactional
    public void updateMajor(Major major) {
        majorDao.updateMajor(major);
    }

    @Override
    @Transactional
    public void deleteMajor(Long majorId) {
        majorDao.deleteMajor(majorId);
    }


}
