package com.example.finalproject_coopedu_management.service;

import com.example.finalproject_coopedu_management.model.AcceptanceStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcceptanceStatusService {

    List<AcceptanceStatus> getAllAcceptStatus ();
    AcceptanceStatus getAcceptStatId (Long acceptStatId);
//    Long addAcceptStat (AcceptanceStatus AcceptanceStatus);
    void addAcceptStat (AcceptanceStatus acceptanceStatus);
    void deleteAcceptStat (Long acceptStatId);


}
