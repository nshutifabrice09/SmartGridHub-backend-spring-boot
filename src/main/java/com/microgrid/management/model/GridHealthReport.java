package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "grid_healthy_reports")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GridHealthReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime generatedAt;
    private double totalConsumption;
    private double totalProduction;
    private double lossPercentage;

    @ManyToOne
    private Microgrid microgrid;
}
