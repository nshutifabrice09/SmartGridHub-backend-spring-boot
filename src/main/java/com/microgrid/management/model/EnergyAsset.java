package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;

@Entity
@Table(name = "energy_assets")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnergyAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Type type;
    private double capacity;
    private double currentOutput;

    @ManyToOne
    private Microgrid microgrid;

    @ManyToOne
    private User owner;
}
