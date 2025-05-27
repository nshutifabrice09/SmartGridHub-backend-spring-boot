package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance_requests")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaintenanceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime requestDate;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private EnergyAsset asset;

    @ManyToOne
    @JoinColumn(name = "requestBy_id")
    private User requestedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public EnergyAsset getAsset() {
        return asset;
    }

    public void setAsset(EnergyAsset asset) {
        this.asset = asset;
    }

    public User getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(User requestedBy) {
        this.requestedBy = requestedBy;
    }
}
