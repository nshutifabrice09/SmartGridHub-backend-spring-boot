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
    private Microgrid microgrid;
}
