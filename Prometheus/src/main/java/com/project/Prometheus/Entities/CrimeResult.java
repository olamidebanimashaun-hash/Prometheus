package com.project.Prometheus.Entities;

public record CrimeResult(
        String statisticLabel,
        String yearDate,
        String offence,
        String division,
        Integer amount
) {
}