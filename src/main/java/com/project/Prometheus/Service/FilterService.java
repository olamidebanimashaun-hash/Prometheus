package com.project.Prometheus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Prometheus.Repositories.FilterRepo;

@Service
public class FilterService {
    @Autowired
    FilterRepo filterRepo;

    public List<String> getFilter(String fieldName) {
        return filterRepo.getDistinctField(fieldName);
    }
}

