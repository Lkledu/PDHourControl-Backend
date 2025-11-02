package com.PD.HourControl.controllers;

import com.PD.HourControl.entities.Report;
import com.PD.HourControl.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ReportService service;

    @GetMapping("/getSquad/{id}")
    public ResponseEntity<Report> getReport (@PathVariable int id) {
        Report report;
        try {
            report = service.getReport(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(report);
    }
}
