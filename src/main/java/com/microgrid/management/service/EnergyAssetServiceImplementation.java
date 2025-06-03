package com.microgrid.management.service;

import com.microgrid.management.model.EnergyAsset;
import com.microgrid.management.model.Microgrid;
import com.microgrid.management.model.User;
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
        return energyAssetRepository.findAll();
    }

    @Override
    public EnergyAsset getEnergyAsset(Long id) {
        return energyAssetRepository.findEnergyAssetById(id);
    }

    @Override
    public EnergyAsset saveEnergyAsset(EnergyAsset energyAsset, Long microgridId, Long ownerId) {
        Microgrid microgrid = microgridRepository.findMicrogridById(microgridId);
        User user = userRepository.findUserById(ownerId);
        energyAsset.setMicrogrid(microgrid);
        energyAsset.setOwner(user);
        return energyAssetRepository.save(energyAsset);
    }

    @Override
    public EnergyAsset updateEnergyAsset(Long id, EnergyAsset energyAsset) {
        return null;
    }

    @Override
    public void removeEnergyAsset(Long id) {
        energyAssetRepository.deleteById(id);
    }
}
