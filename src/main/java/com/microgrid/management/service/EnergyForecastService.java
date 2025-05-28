package com.microgrid.management.service;

import com.microgrid.management.model.EnergyForecast;

import java.util.List;

public interface EnergyForecastService {
    List<EnergyForecast> getAllEnergyForecasts();
    EnergyForecast getEnergyForecastById(Long id);
    EnergyForecast saveEnergyForecast(EnergyForecast energyForecast, Long microgridId);
    EnergyForecast updateEnergyForecast(EnergyForecast energyForecast, Long id);
    void removeEnergyForecast(Long id);
}
