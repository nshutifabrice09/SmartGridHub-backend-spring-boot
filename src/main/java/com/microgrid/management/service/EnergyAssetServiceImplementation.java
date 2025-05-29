package com.microgrid.management.service;

import com.microgrid.management.model.EnergyAsset;
import com.microgrid.management.repository.EnergyAssetRepository;
import com.microgrid.management.repository.MicrogridRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyAssetServiceImplementation implements EnergyAssetService{
    private final EnergyAssetRepository energyAssetRepository;
    private final MicrogridRepository microgridRepository;
    private final UserRepository userRepository;

    @Autowired
    public EnergyAssetServiceImplementation(EnergyAssetRepository energyAssetRepository, MicrogridRepository microgridRepository, UserRepository userRepository) {
        this.energyAssetRepository = energyAssetRepository;
        this.microgridRepository = microgridRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<EnergyAsset> getAllEnergyAssets() {
        return null;
    }

    @Override
    public EnergyAsset getEnergyAsset(Long id) {
        return null;
    }

    @Override
    public EnergyAsset saveEnergyAsset(EnergyAsset energyAsset, Long microgridId, Long ownerId) {
        return null;
    }

    @Override
    public EnergyAsset updateEnergyAsset(Long id, EnergyAsset energyAsset) {
        return null;
    }

    @Override
    public void removeEnergyAsset(Long id) {

    }
}
