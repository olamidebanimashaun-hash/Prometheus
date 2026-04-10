package com.project.Prometheus.Repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class FilterRepo {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getInitialDistinctField(String fieldName) {
        return entityManager.createQuery(
            "SELECT DISTINCT c." + fieldName + " FROM CrimeEntity c",
            String.class
        ).getResultList();
    }
}
