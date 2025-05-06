package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class MaintenanceRequest {
    private Long id;

    private String description;
    private String status; // OPEN, IN_PROGRESS, RESOLVED
    private LocalDateTime requestDate;

    @ManyToOne
    private EnergyAsset asset;

    @ManyToOne
    private User requestedBy;
}
