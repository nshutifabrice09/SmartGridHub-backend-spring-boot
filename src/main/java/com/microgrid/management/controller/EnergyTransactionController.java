package com.microgrid.management.controller;

import com.microgrid.management.service.EnergyTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnergyTransactionController {
    private final EnergyTransactionService energyTransactionService;

    @Autowired
    public EnergyTransactionController (EnergyTransactionService energyTransactionService){
        this.energyTransactionService=energyTransactionService;
    }
}
