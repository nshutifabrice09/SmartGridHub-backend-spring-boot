package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.lang.reflect.Type;

public class EnergyAsset {
    private Long id;

    private Type type;
    private double capacity;
    private double currentOutput;

    @ManyToOne
    private Microgrid microgrid;

    @ManyToOne
    private User owner;
}
