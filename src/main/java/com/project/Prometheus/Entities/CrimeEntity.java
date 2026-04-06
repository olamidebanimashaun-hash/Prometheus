package com.project.Prometheus.Entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="crime")
public class CrimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String region;
    private String garda_division;
    private String offence_code;
    private String type_of_offence;
    private String offence;
    private Integer year;
    private Integer quarter;
    private Integer offence_count;
    
}