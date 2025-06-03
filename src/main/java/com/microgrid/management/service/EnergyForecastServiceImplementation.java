package com.microgrid.management.service;

import com.microgrid.management.model.EnergyForecast;
import com.microgrid.management.model.Microgrid;
import com.microgrid.management.repository.EnergyForecastRepository;
import com.microgrid.management.repository.MicrogridRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyForecastServiceImplementation implements EnergyForecastService {

    private EnergyForecastRepository energyForecastRepository;
    private MicrogridRepository microgridRepository;

    @Autowired
    public EnergyForecastServiceImplementation(EnergyForecastRepository energyForecastRepository, MicrogridRepository microgridRepository) {
        this.energyForecastRepository = energyForecastRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<EnergyForecast> getAllEnergyForecasts() {
        return energyForecastRepository.findAll();
    }

    @Override
    public EnergyForecast getEnergyForecastById(Long id) {
        return energyForecastRepository.findEnergyForecastById(id);
    }

    @Override
    public EnergyForecast saveEnergyForecast(EnergyForecast energyForecast, Long microgridId) {
        Microgrid microgrid = microgridRepository.findMicrogridById(microgridId);
        energyForecast.setMicrogrid(microgrid);
        return energyForecastRepository.save(energyForecast);
    }

    @Override
    public EnergyForecast updateEnergyForecast(EnergyForecast energyForecast, Long id) {
        return null;
    }

    @Override
    public void removeEnergyForecast(Long id) {

    }
}
