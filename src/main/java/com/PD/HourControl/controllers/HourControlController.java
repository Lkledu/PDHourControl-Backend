package com.PD.HourControl.controllers;

import com.PD.HourControl.entities.Employee;
import com.PD.HourControl.entities.Report;
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

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<String> getEmployee (@PathVariable int id) {
        try {
            employeeService.getEmployee(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Squad created successfully");
    }

    @PostMapping("/registerEmployee")
    public ResponseEntity<String> postEmployee (@RequestBody Employee employee) {
        try {
            employeeService.createEmployee();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("");
    }

    @GetMapping("/getReport/{id}")
    public ResponseEntity<Report> getReport (@PathVariable int id) {
        Report report;
        try {
            report = reportService.getReport(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok().body(report);
    }

    @GetMapping("/getSquad/{id}")
    public ResponseEntity<String> getSquad (@PathVariable int id) {
        try {
            squadService.getSquad(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Squad created successfully");
    }
}
