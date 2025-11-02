package com.PD.HourControl.services;

import com.PD.HourControl.entities.Employee;
import com.PD.HourControl.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public Employee getEmployee(int id) {
        return repository.findById(id);
    }
}
