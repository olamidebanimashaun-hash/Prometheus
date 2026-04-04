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
        return entityManager.createQuery("SELECT c\r\n" + 
                        "FROM CrimeEntity c\r\n" + 
                        "WHERE c.offence = :offence\r\n" + 
                        "AND (\r\n" + 
                        "    (c.year > :startYear OR (c.year = :startYear AND c.quarter >= :startQuarter))\r\n" + 
                        "AND\r\n" + //
                        "    (c.year < :endYear OR (c.year = :endYear AND c.quarter <= :endQuarter))\r\n" + 
                        ")", CrimeEntity.class)
                .setParameter("offence", filter.getType())
                .setParameter("endQuarter", filter.getEndDate().quarter())
                .setParameter("endYear", filter.getEndDate().year())
                .setParameter("startQuarter", filter.getStartDate().quarter())
                .setParameter("startYear", filter.getStartDate().year())
                .getResultList();
    }
}