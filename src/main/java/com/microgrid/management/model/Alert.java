package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Alert {
    private Long id;

    private String message;
    private String type; // WARNING, ERROR, INFO
    private LocalDateTime timestamp;

    @ManyToOne
    private Microgrid microgrid;
}
