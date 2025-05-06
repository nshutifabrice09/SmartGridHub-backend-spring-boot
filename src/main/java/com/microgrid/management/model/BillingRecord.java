package com.microgrid.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "billing_records")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BillingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate billingDate;
    private double totalKwhUsed;
    private double amountDue;

    @ManyToOne
    private User user;
}
