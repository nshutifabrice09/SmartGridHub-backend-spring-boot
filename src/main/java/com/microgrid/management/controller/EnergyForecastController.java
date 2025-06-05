package com.microgrid.management.controller;

import com.microgrid.management.model.EnergyForecast;
import com.microgrid.management.service.EnergyForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnergyForecastController {

    private final EnergyForecastService energyForecastService;

    @Autowired
    private EnergyForecastController(EnergyForecastService energyForecastService){
        this.energyForecastService = energyForecastService;
    }

    @PostMapping("/energyForecast/{microgridId}")
    public EnergyForecast save(@RequestBody EnergyForecast energyForecast, @PathVariable ("microgridId") Long microgridId){
        return energyForecastService.saveEnergyForecast(energyForecast, microgridId);
    }

    @GetMapping("/energyForecasts")
    public List<EnergyForecast> energyForecastList(){
        return energyForecastService.getAllEnergyForecasts();
    }

    @GetMapping("/energyForecast/{id}")
    public EnergyForecast getEnergyForecast(@PathVariable ("id") Long id){
        return energyForecastService.getEnergyForecastById(id);
    }

    @PutMapping("/update/energyForecast/{id}")
    public EnergyForecast updateEnergyForecast(@PathVariable ("id") Long id, @RequestBody EnergyForecast energyForecast){
        return energyForecastService.updateEnergyForecast(energyForecast, id);
    }

    @DeleteMapping("/delete/energyForecast/{id}")
    public void removeEnergyForecast(@PathVariable ("id") Long id){
        energyForecastService.removeEnergyForecast(id);
    }
}
