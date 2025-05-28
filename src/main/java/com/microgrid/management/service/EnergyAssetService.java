package com.microgrid.management.service;

import com.microgrid.management.model.EnergyAsset;

import java.util.List;

public interface EnergyAssetService {
    List<EnergyAsset> getAllEnergyAssets();
    EnergyAsset getEnergyAsset(Long id);
    EnergyAsset saveEnergyAsset(EnergyAsset energyAsset, Long microgridId,Long ownerId);
    EnergyAsset updateEnergyAsset(Long id, EnergyAsset energyAsset);
    void removeEnergyAsset(Long id);
}
