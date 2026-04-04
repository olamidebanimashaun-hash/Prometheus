package com.project.Prometheus.Constants;

public class Filter {
    public String type;
    public String endDate;
    public String startDate;
    public String offenceCode;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getOffenceCode() {
        return offenceCode;
    }
    public void setOffenceCode(String offenceCode) {
        this.offenceCode = offenceCode;
    }

    public DateRange getEndDate() {
    if (endDate.matches("\\d{4}Q[1-4]")) {
        int year = Integer.parseInt(endDate.substring(0, 4));
        int quarter = Integer.parseInt(endDate.substring(5));
        return new DateRange(year, quarter);
        } 
        else {
            throw new IllegalArgumentException("Invalid format: " + endDate);
        }
    }
    public DateRange getStartDate() {
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

