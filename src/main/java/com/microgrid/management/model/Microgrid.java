package com.microgrid.management.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Microgrid {
    private Long id;

    private String name;
    private String location;
    private double totalCapacity; // in kWh

    @OneToMany(mappedBy = "microgrid")
    private List<User> users;

    @OneToMany(mappedBy = "microgrid")
    private List<EnergyAsset> assets;
}
