package com.project.Prometheus.Constants;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Filter {
    @NotNull private String endDate;
    @NotNull private String startDate;
    @NotNull private String[] offenceType;
    @NotNull private String[] offenceCode;
    @NotNull private String[] offence;
    @NotNull private String[] region;
    @NotNull private String[] gardaDivision;

    public DateRange getValidEndDate() {
    if (endDate.matches("\\d{4}Q[1-4]")) {
        int year = Integer.parseInt(endDate.substring(0, 4));
        int quarter = Integer.parseInt(endDate.substring(5));
        return new DateRange(year, quarter);
        } 
        else {
            throw new IllegalArgumentException("Invalid format: " + endDate);
        }
    }
    
    public DateRange getValidStartDate() {
    if (startDate.matches("\\d{4}Q[1-4]")) {
        int year = Integer.parseInt(startDate.substring(0, 4));
        int quarter = Integer.parseInt(startDate.substring(5));
        return new DateRange(year, quarter);
        } 
        else {
            throw new IllegalArgumentException("Invalid format: " + startDate);
        }
    }

}

