package com.microgrid.management.controller;

import com.microgrid.management.model.EnergyAsset;
import com.microgrid.management.service.EnergyAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnergyAssetController {

    private final EnergyAssetService energyAssetService;

    @Autowired
    public EnergyAssetController(EnergyAssetService energyAssetService){
        this.energyAssetService=energyAssetService;
    }
    @GetMapping("/energyAssets")
    public List<EnergyAsset> energyAssetList(){
        return energyAssetService.getAllEnergyAssets();
    }
    @GetMapping("/energyAsset/{id}")
    public EnergyAsset getEnergyAsset(@PathVariable ("id") Long id){
        return energyAssetService.getEnergyAsset(id);
    }

    @PostMapping("/energyAsset")
    public EnergyAsset saveEnergyAsset (@RequestBody EnergyAsset energyAsset){
        return energyAssetService.saveEnergyAsset(energyAsset);
    }

    @PutMapping("/update/energyAsset/{id}")
    public EnergyAsset updateEnergyAsset(@PathVariable ("id") Long id, @RequestBody EnergyAsset energyAsset){
        return energyAssetService.updateEnergyAsset(id, energyAsset);
    }

    @DeleteMapping("/delete/energyAsset/{id}")
    public void removeEnergyAsset(@PathVariable ("id") Long id){
        energyAssetService.removeEnergyAsset(id);
    }
}
