package com.microgrid.management.service;

import com.microgrid.management.model.MaintenanceRequest;
import com.microgrid.management.repository.EnergyAssetRepository;
import com.microgrid.management.repository.MaintenanceRequestRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRequestServiceImplementation implements MaintenanceRequestService{
    private final MaintenanceRequestRepository maintenanceRequestRepository;
    private final EnergyAssetRepository energyAssetRepository;
    private final UserRepository userRepository;

    @Autowired
    public MaintenanceRequestServiceImplementation(MaintenanceRequestRepository maintenanceRequestRepository, EnergyAssetRepository energyAssetRepository, UserRepository userRepository) {
        this.maintenanceRequestRepository = maintenanceRequestRepository;
        this.energyAssetRepository = energyAssetRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<MaintenanceRequest> getAllMaintenanceRequests() {
        return maintenanceRequestRepository.findAll();
    }

    @Override
    public MaintenanceRequest getMaintenanceRequestById(Long id) {
        return maintenanceRequestRepository.findMaintenanceRequestById(id);
    }

    @Override
    public MaintenanceRequest saveMaintenanceRequest(MaintenanceRequest maintenanceRequest, Long assetId, Long requestById) {
        return null;
    }

    @Override
    public MaintenanceRequest updateMaintenanceRequest(MaintenanceRequest maintenanceRequest, Long id) {
        return null;
    }

    @Override
    public void removeMaintenanceRequest(Long id) {

    }
}