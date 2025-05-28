package com.microgrid.management.service;

import com.microgrid.management.model.MaintenanceRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRequestServiceImplementation implements MaintenanceRequestService{
    @Override
    public List<MaintenanceRequest> getAllMaintenanceRequests() {
        return null;
    }

    @Override
    public MaintenanceRequest getMaintenanceRequestById(Long id) {
        return null;
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
