package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name = "energy_forecasts")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnergyForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double expectedProduction;
    private double expectedConsumption;
    @ManyToOne
    private Microgrid microgrid;
}
