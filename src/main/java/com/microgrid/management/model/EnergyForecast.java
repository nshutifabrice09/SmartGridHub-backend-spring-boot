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
    @JoinColumn(name = "microgrid_id")
    private Microgrid microgrid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getExpectedProduction() {
        return expectedProduction;
    }

    public void setExpectedProduction(double expectedProduction) {
        this.expectedProduction = expectedProduction;
    }

    public double getExpectedConsumption() {
        return expectedConsumption;
    }

    public void setExpectedConsumption(double expectedConsumption) {
        this.expectedConsumption = expectedConsumption;
    }

    public Microgrid getMicrogrid() {
        return microgrid;
    }

    public void setMicrogrid(Microgrid microgrid) {
        this.microgrid = microgrid;
    }
}
