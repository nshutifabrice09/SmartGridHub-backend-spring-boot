package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class EnergyForecast {

    private Long id;

    private LocalDate date;
    private double expectedProduction;
    private double expectedConsumption;

    @ManyToOne
    private Microgrid microgrid;
}
