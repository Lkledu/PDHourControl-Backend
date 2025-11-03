package com.PD.HourControl.controllers;

import com.PD.HourControl.entities.Employee;
import com.PD.HourControl.entities.Report;
import com.PD.HourControl.entities.Squad;
import com.PD.HourControl.services.EmployeeService;
import com.PD.HourControl.services.ReportService;
import com.PD.HourControl.services.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hour_control")
public class HourControlController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    ReportService reportService;

    @Autowired
    SquadService squadService;

    @PostMapping("/employee")
    public ResponseEntity<String> postEmployee (@RequestBody Employee employee) {
        try {
            employeeService.createEmployee(employee.name, employee.estimatedHours, employee.squadId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Employee registered successfully");
    }

    @PostMapping("/report")
    public ResponseEntity<String> postReport (@RequestBody Report report) {
        try {
            reportService.createReport(report.description, report.employeeId, report.spentHours);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Report created successfully");
    }

    @PostMapping("/squad")
    public ResponseEntity<String> postSquad (@RequestBody Squad squad) {
        try {
            squadService.createSquad(squad.name);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Squad created successfully");
    }
}
