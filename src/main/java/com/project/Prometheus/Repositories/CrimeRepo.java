package com.project.Prometheus.Repositories;
import jakarta.persistence.*; 
import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeEntity;

import java.util.List;


import org.springframework.stereotype.Repository;

@Repository
public class CrimeRepo{

    @PersistenceContext
    private EntityManager entityManager;

    public List<CrimeEntity> getCrimes(Filter filter){
        // This method will query the database and return a list of crimes based on the filter
        return entityManager.createQuery("SELECT c " + 
                        "FROM CrimeEntity c " + 
                        "WHERE c.offence = :offence " + 
                        "AND ((c.year > :startYear OR (c.year = :startYear AND c.quarter >= :startQuarter)) " + 
                        "AND (c.year < :endYear OR (c.year = :endYear AND c.quarter <= :endQuarter))) ", 
                        CrimeEntity.class)
                .setParameter("offence", filter.getType())
                .setParameter("endQuarter", filter.getEndDate().quarter())
                .setParameter("endYear", filter.getEndDate().year())
                .setParameter("startQuarter", filter.getStartDate().quarter())
                .setParameter("startYear", filter.getStartDate().year())
                .getResultList();
    }
}