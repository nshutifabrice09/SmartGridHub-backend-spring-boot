package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class OptimizationLog {

    private Long id;

    private String recommendation;
    private LocalDateTime timestamp;
    @ManyToOne
    private Microgrid microgrid;
}
