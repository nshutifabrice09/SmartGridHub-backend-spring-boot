package com.microgrid.management.service;

import com.microgrid.management.model.MaintenanceRequest;

import java.util.List;

public interface MaintenanceService {
    List<MaintenanceRequest> getAllMaintenanceRequests();
}
