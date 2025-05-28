package com.microgrid.management.service;

import com.microgrid.management.model.MaintenanceRequest;

import java.util.List;

public interface MaintenanceRequestService {
    List<MaintenanceRequest> getAllMaintenanceRequests();
    MaintenanceRequest getMaintenanceRequestById(Long id);
    MaintenanceRequest saveMaintenanceRequest(MaintenanceRequest maintenanceRequest, Long assetId, Long requestById);
    MaintenanceRequest updateMaintenanceRequest(MaintenanceRequest maintenanceRequest, Long id);
    void removeMaintenanceRequest(Long id);
}
