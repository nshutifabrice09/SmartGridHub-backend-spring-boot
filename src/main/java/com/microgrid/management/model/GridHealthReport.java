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
    @JoinColumn(name = "microgrid_id")
    private Microgrid microgrid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }

    public double getTotalConsumption() {
        return totalConsumption;
    }

    public void setTotalConsumption(double totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

    public double getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(double totalProduction) {
        this.totalProduction = totalProduction;
    }

    public double getLossPercentage() {
        return lossPercentage;
    }

    public void setLossPercentage(double lossPercentage) {
        this.lossPercentage = lossPercentage;
    }

    public Microgrid getMicrogrid() {
        return microgrid;
    }

    public void setMicrogrid(Microgrid microgrid) {
        this.microgrid = microgrid;
    }
}
