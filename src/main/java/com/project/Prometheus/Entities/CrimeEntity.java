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
    private String region;
    private String garda_division;
    private String offence_code;
    private String offence;
    private Integer year;
    private Integer quarter;
    private Integer offence_count;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getGarda_division() {
        return garda_division;
    }
    public void setGarda_division(String garda_division) {
        this.garda_division = garda_division;
    }
    public String getOffence_code() {
        return offence_code;
    }
    public void setOffence_code(String offence_code) {
        this.offence_code = offence_code;
    }
    public String getOffence() {
        return offence;
    }
    public void setOffence(String offence) {
        this.offence = offence;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getQuarter() {
        return quarter;
    }
    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }
    public Integer getOffence_count() {
        return offence_count;
    }
    public void setOffence_count(Integer offence_count) {
        this.offence_count = offence_count;
    }

    

    
}