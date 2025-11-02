package com.PD.HourControl.controllers;

import com.PD.HourControl.services.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/squad")
public class SquadController {
    @Autowired
    SquadService service;

    @GetMapping("/getSquad/{id}")
    public ResponseEntity<String> getSquad (@PathVariable int id) {
        try {
            service.getSquad(id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok().body("Squad created successfully");
    }
}
