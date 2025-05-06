package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "microgrids")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Microgrid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private double totalCapacity;

    @OneToMany(mappedBy = "microgrid")
    private List<User> users;

    @OneToMany(mappedBy = "microgrid")
    private List<EnergyAsset> assets;
}
