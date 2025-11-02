package com.PD.HourControl.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "squad", schema = "public")
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;

    public Squad() {
    }

    public Squad(Integer id, String name) {
        this.id = id;
        this.name = name;
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
    //</editor-fold>
}
