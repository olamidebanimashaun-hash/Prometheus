package com.project.Prometheus.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeEntity;
import com.project.Prometheus.Entities.CrimeResult;
import com.project.Prometheus.Repositories.CrimeRepo;

@Service
public class CrimeService {
    // This class will handle
    @Autowired
    CrimeRepo crimeRepo;

    public List<CrimeResult> getCrimes(Filter filter) {
        // This method will call the CrimeRepo to get the crimes based on the filter
        List<CrimeResult> crimeResults = new ArrayList<CrimeResult>();
        List<CrimeEntity> crimes = crimeRepo.getCrimes(filter);
        for (CrimeEntity crime : crimes) {
            System.out.println(crime);
            CrimeResult cr = new CrimeResult(crime.getTypeOffence(), crime.getDivision());
            crimeResults.add(cr);
        }

        return crimeResults;
    }
    

}