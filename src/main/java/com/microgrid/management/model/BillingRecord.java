package com.microgrid.management.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class BillingRecord {
    private Long id;

    private LocalDate billingDate;
    private double totalKwhUsed;
    private double amountDue;

    @ManyToOne
    private User user;
}
