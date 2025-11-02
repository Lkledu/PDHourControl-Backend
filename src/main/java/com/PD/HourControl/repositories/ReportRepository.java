package com.PD.HourControl.repositories;

import com.PD.HourControl.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {
    Report findById(int id);
}
