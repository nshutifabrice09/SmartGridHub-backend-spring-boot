package com.microgrid.management.service;

import com.microgrid.management.model.EnergyForecast;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyForecastServiceImplementation implements EnergyForecastService {
    @Override
    public List<EnergyForecast> getAllEnergyForecasts() {
        return null;
    }

    @Override
    public EnergyForecast getEnergyForecastById(Long id) {
        return null;
    }

    @Override
    public EnergyForecast saveEnergyForecast(EnergyForecast energyForecast, Long microgridId) {
        return null;
    }

    @Override
    public EnergyForecast updateEnergyForecast(EnergyForecast energyForecast, Long id) {
        return null;
    }

    @Override
    public void removeEnergyForecast(Long id) {

    }
}
