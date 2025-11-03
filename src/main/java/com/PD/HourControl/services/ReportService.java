package com.PD.HourControl.services;

import com.PD.HourControl.entities.Report;
import com.PD.HourControl.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReportService {
    @Autowired
    ReportRepository repository;

    public Report getReport(int id) {
        return repository.findById(id);
    }

    public void createReport(String description, Integer employeeId, Integer spentHours) {
        Report report = new Report(0, description, employeeId, spentHours, LocalDateTime.now());
        repository.save(report);
    }
}
