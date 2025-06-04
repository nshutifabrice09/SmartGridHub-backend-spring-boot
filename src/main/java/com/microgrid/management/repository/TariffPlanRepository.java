package com.microgrid.management.repository;

import com.microgrid.management.model.TariffPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffPlanRepository extends JpaRepository <TariffPlan, Long> {
    TariffPlan findTariffPlanById(Long id);
}
