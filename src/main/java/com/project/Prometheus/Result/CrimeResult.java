package com.project.Prometheus.Result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CrimeResult {
    private String garda_division;
    private Integer year;
    private Integer quarter;
    private String offence;
    private String offence_code;
    private Integer offence_count;


}