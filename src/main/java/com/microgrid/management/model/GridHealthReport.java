package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class GridHealthReport {
    private Long id;

    private LocalDateTime generatedAt;
    private double totalConsumption;
    private double totalProduction;
    private double lossPercentage;

    @ManyToOne
    private Microgrid microgrid;
}
