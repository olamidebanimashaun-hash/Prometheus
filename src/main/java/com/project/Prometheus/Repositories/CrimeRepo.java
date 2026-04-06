package com.project.Prometheus.Repositories;
import jakarta.persistence.*; 
import com.project.Prometheus.Constants.Filter;
import com.project.Prometheus.Entities.CrimeEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CrimeRepo{

    @PersistenceContext
    private EntityManager entityManager;

    public List<CrimeEntity> getCrimes(Filter filter) {

        StringBuilder jpql = new StringBuilder("SELECT c FROM CrimeEntity c WHERE ");
        Map<String, Object> params = new HashMap<>();

        jpql.append("(c.year > :startYear OR (c.year = :startYear AND c.quarter >= :startQuarter)) ");
        jpql.append("AND (c.year < :endYear OR (c.year = :endYear AND c.quarter <= :endQuarter)) ");

        params.put("startYear", filter.getValidStartDate().year());
        params.put("startQuarter", filter.getValidStartDate().quarter());
        params.put("endYear", filter.getValidEndDate().year());
        params.put("endQuarter", filter.getValidEndDate().quarter());

        if (filter.getRegion() != null && !filter.getRegion().isEmpty()) {
            jpql.append("AND c.region = :region ");
            params.put("region", filter.getRegion());
        }

        if (filter.getOffenceType() != null && !filter.getOffenceType().isEmpty()) {
            jpql.append("AND c.type_of_offence = :offenceType ");
            params.put("offenceType", filter.getOffenceType());
        }

        if (filter.getOffenceCode() != null && !filter.getOffenceCode().isEmpty()) {
            jpql.append("AND c.offence_code = :offenceCode ");
            params.put("offenceCode", filter.getOffenceCode());
        }

        if (filter.getGardaDivision() != null && !filter.getGardaDivision().isEmpty()) {
            jpql.append("AND c.garda_division = :gardaDivision ");
            params.put("gardaDivision", filter.getGardaDivision());
        }

        if (filter.getOffence() != null && !filter.getOffence().isEmpty()) {
            jpql.append("AND c.offence = :offence ");
            params.put("offence", filter.getOffence());
        }

        TypedQuery<CrimeEntity> query =
                entityManager.createQuery(jpql.toString(), CrimeEntity.class);

        params.forEach(query::setParameter);

        return query.getResultList();
    }
}