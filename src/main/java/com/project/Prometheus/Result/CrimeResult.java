package com.project.Prometheus.Result;

public record CrimeResult(
        String garda_division,
        Integer year,
        Integer quarter,
        String offence,
        String offence_code,
        Integer offence_count
) {
}                  