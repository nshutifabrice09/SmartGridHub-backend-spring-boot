package com.microgrid.management.controller;

import com.microgrid.management.model.EnergyAsset;
import com.microgrid.management.service.EnergyAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
