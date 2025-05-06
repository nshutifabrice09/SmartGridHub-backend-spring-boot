package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalTime;

public class TariffPlan {
    private Long id;

    private String name;
    private double ratePerKwh;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    private Microgrid microgrid;
}
