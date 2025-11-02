package com.PD.HourControl.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;
    public Integer estimatedHours;
    @Column(name = "squad_id")
    public Integer squadId;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer estimatedHours, Integer squadId) {
        this.id = id;
        this.name = name;
        this.estimatedHours = estimatedHours;
        this.squadId = squadId;
    }

    //<editor-fold desc="getters setters">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public Integer getSquadId() {
        return squadId;
    }

    public void setSquadId(Integer squadId) {
        this.squadId = squadId;
    }
    //</editor-fold>
}
