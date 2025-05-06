package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDateTime;

@Entity
@Table(name = "energy_usage_records")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptimizationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recommendation;
    private LocalDateTime timestamp;
    @ManyToOne
    private Microgrid microgrid;
}
