package com.PD.HourControl.services;

import com.PD.HourControl.entities.Report;
import com.PD.HourControl.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    ReportRepository repository;

    public Report getReport(int id) {
        return repository.findById(id);
    }
}
