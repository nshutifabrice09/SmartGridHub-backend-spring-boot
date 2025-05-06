package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class EnergyUsageRecord {
    private Long id;

    private LocalDateTime timestamp;
    private double consumption;
    private double production;

    @ManyToOne
    private User user;
}
