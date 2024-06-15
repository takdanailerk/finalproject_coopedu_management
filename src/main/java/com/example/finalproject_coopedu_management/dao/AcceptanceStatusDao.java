package com.example.finalproject_coopedu_management.dao;

import com.example.finalproject_coopedu_management.model.AcceptanceStatus;
import com.example.finalproject_coopedu_management.model.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcceptanceStatusDao {

    List<AcceptanceStatus> getAllAcceptStatus ();
    AcceptanceStatus getAcceptStatId (Long acceptStatId);
//    Long addAcceptStat (AcceptanceStatus acceptanceStatus);
    void addAcceptStat (AcceptanceStatus acceptanceStatus);
    void deleteAcceptStat (Long acceptStatId);

}
