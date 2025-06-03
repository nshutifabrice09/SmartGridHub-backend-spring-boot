package com.microgrid.management.repository;

import com.microgrid.management.model.EnergyAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyAssetRepository extends JpaRepository <EnergyAsset, Long> {
    EnergyAsset findEnergyAssetById(Long id);
}
