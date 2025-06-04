package com.microgrid.management.repository;

import com.microgrid.management.model.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRequestRepository extends JpaRepository <MaintenanceRequest, Long> {
    MaintenanceRequest findMaintenanceRequestById(Long id);
}
