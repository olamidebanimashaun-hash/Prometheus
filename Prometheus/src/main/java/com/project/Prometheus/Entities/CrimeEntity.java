package com.project.Prometheus.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crime")
public class CrimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeoffence;
    private String division;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTypeOffence() {
        return typeoffence;
    }
    public void setTypeOffence(String typeoffence) {
        this.typeoffence = typeoffence;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    
@Override
public String toString() {
    // Getters and setters
    return "CrimeEntity{" +
            "id=" + id +
            ", gardaDivision='" + division + '\'' +
            ", typeOfOffence='" + typeoffence + '\'' +
 
            '}';
}
}