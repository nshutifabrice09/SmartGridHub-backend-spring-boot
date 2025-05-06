package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class EnergyTransaction {
    private Long id;

    private double amount; // kWh
    private double pricePerKwh;
    private LocalDateTime timestamp;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;
}
