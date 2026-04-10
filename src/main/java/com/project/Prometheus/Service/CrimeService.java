package com.project.Prometheus.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeEntity;
import com.project.Prometheus.Repositories.CrimeRepo;
import com.project.Prometheus.Result.CrimeResult;

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
            CrimeResult cr = new CrimeResult(
                    crime.getGarda_division(),
                    crime.getYear(),
                    crime.getQuarter(),
                    crime.getOffence(),
                    crime.getOffence_code(),
                    crime.getOffence_count()
            );
            crimeResults.add(cr);
        }

        return crimeResults;
    }


        public List<CrimeResult> getAreaCrimes(Filter filter) {
            List<CrimeEntity> crimes = crimeRepo.getGroupedCrimes(filter);

            Map<String, CrimeResult> grouped = new HashMap<>();

            for (CrimeEntity crime : crimes) {
                String key = crime.getGarda_division() + "_" + crime.getOffence();

                if (!grouped.containsKey(key)) {
                    grouped.put(key, new CrimeResult(
                            crime.getGarda_division(),
                            null, // year optional now
                            null, // quarter optional
                            crime.getOffence(),
                            crime.getOffence_code(),
                            0
                    ));
                }

                CrimeResult existing = grouped.get(key);
                existing.setOffence_count(
                        existing.getOffence_count() + crime.getOffence_count()
                );
            }
            List<CrimeResult> crimeResults = new ArrayList<>(grouped.values());
            return crimeResults;
    }
    

}