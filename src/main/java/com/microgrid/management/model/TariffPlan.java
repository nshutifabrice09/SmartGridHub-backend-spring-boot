package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Entity
@Table(name = "tariff_plans")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TariffPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double ratePerKwh;
    private LocalTime startTime;
    private LocalTime endTime;
    @ManyToOne
    @JoinColumn(name = "microgrid_id")
    private Microgrid microgrid;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatePerKwh() {
        return ratePerKwh;
    }

    public void setRatePerKwh(double ratePerKwh) {
        this.ratePerKwh = ratePerKwh;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Microgrid getMicrogrid() {
        return microgrid;
    }

    public void setMicrogrid(Microgrid microgrid) {
        this.microgrid = microgrid;
    }
}
