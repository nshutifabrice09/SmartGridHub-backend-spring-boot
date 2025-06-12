package com.microgrid.management.controller;

import com.microgrid.management.model.EnergyTransaction;
import com.microgrid.management.service.EnergyTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnergyTransactionController {
    private final EnergyTransactionService energyTransactionService;

    @Autowired
    public EnergyTransactionController(EnergyTransactionService energyTransactionService) {
        this.energyTransactionService = energyTransactionService;
    }

    @PostMapping("/energyTransaction/{userId}/{receiverId")
    public EnergyTransaction save(@RequestBody EnergyTransaction energyTransaction, @PathVariable ("userId") Long userId,
                                  @PathVariable ("receiverId") Long receiverId){
        return energyTransactionService.saveEnergyTransaction(energyTransaction, userId, receiverId);
    }

    @GetMapping("/energyTransactions")
    public List<EnergyTransaction> energyTransactionList(){
        return energyTransactionService.getAllEnergyTransactions();
    }

    @GetMapping("/energyTransaction/{id}")
    public EnergyTransaction getEnergyTransaction(@PathVariable ("id") Long id){
        return energyTransactionService.getEnergyTransactionById(id);
    }

    @PutMapping("/update/energyTransaction/{id)")
    public EnergyTransaction updateEnergyTransaction(@PathVariable ("id") Long id, @RequestBody EnergyTransaction energyTransaction){
        return energyTransactionService.updateEnergyTransaction(id, energyTransaction);
    }

    @DeleteMapping("/delete/energyTransaction/{id}")
    public void remove(@PathVariable ("id") Long id){
        energyTransactionService.removeEnergyTransactionById(id);
    }
}
