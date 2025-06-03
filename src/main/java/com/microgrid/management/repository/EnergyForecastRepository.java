package com.microgrid.management.repository;

import com.microgrid.management.model.EnergyForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyForecastRepository extends JpaRepository <EnergyForecast, Long> {
    EnergyForecast findEnergyForecastById(Long id);
}
