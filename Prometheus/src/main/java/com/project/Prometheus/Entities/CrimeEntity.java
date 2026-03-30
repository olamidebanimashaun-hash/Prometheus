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
    private Long ID;
    private String STATISTIC_LABEL;
    private String YEAR_DATE;
    private String OFFENCE;
    private String DIVISION;
    private String UNIT;
    private Integer AMOUNT;

    
    
public Long getID() {
        return ID;
    }



    public void setID(Long iD) {
        ID = iD;
    }



    public String getSTATISTIC_LABEL() {
        return STATISTIC_LABEL;
    }



    public void setSTATISTIC_LABEL(String sTATISTIC_LABEL) {
        STATISTIC_LABEL = sTATISTIC_LABEL;
    }



    public String getYEAR_DATE() {
        return YEAR_DATE;
    }



    public void setYEAR_DATE(String yEAR_DATE) {
        YEAR_DATE = yEAR_DATE;
    }



    public String getOFFENCE() {
        return OFFENCE;
    }



    public void setOFFENCE(String oFFENCE) {
        OFFENCE = oFFENCE;
    }



    public String getDIVISION() {
        return DIVISION;
    }



    public void setDIVISION(String dIVISION) {
        DIVISION = dIVISION;
    }



    public String getUNIT() {
        return UNIT;
    }



    public void setUNIT(String uNIT) {
        UNIT = uNIT;
    }



    public Integer getAMOUNT() {
        return AMOUNT;
    }



    public void setAMOUNT(Integer aMOUNT) {
        AMOUNT = aMOUNT;
    }
}