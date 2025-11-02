package com.PD.HourControl.services;

import com.PD.HourControl.entities.Squad;
import com.PD.HourControl.repositories.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquadService {
    @Autowired
    SquadRepository repository;

    public Squad getSquad(int id) {
        return repository.findById(id);
    }
}
