package com.project.Prometheus.Repositories;
import jakarta.persistence.*; 
import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeEntity;
import com.project.Prometheus.Entities.CrimeResult;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class CrimeRepo{

    @PersistenceContext
    private EntityManager entityManager;

    public List<CrimeEntity> getCrimes(Filter filter){
        // This method will query the database and return a list of crimes based on the filter
        return entityManager.createQuery("SELECT c FROM CrimeEntity c WHERE c.typeoffence = :typeoffence", CrimeEntity.class)
                .setParameter("typeoffence", filter.getType())
                // .setParameter("startDate", filter.getStartDate())
                // .setParameter("endDate", filter.getEndDate())
                .getResultList();
    }
}