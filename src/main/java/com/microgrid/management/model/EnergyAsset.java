package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "energy_assets")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnergyAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;
    private double capacity;
    private double currentOutput;

    @ManyToOne
    private Microgrid microgrid;

    @ManyToOne
    private User owner;
}
