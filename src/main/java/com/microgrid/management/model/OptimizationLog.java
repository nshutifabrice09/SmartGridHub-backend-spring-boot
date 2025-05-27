package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDateTime;

@Entity
@Table(name = "optimization_logs")
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
    @JoinColumn(name = "microgrid_id")
    private Microgrid microgrid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Microgrid getMicrogrid() {
        return microgrid;
    }

    public void setMicrogrid(Microgrid microgrid) {
        this.microgrid = microgrid;
    }
}
