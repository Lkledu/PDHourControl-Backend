package com.PD.HourControl.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "report", schema = "public")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String description;
    @Column(name = "employee_id")
    public Integer employeeId;
    public Integer spentHours;
    public Date createdAt;

    public Report() {
    }

    public Report(Integer id, String description, Integer employeeId, Integer spentHours, Date createdAt) {
        this.id = id;
        this.description = description;
        this.employeeId = employeeId;
        this.spentHours = spentHours;
        this.createdAt = createdAt;
    }

    //<editor-fold desc="getters setters">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSpentHours() {
        return spentHours;
    }

    public void setSpentHours(Integer spentHours) {
        this.spentHours = spentHours;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    //</editor-fold>
}
