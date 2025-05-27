package com.microgrid.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<User> users;

    @OneToMany(mappedBy = "microgrid")
    @JsonIgnore
    private List<EnergyAsset> assets;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(double totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<EnergyAsset> getAssets() {
        return assets;
    }

    public void setAssets(List<EnergyAsset> assets) {
        this.assets = assets;
    }
}
