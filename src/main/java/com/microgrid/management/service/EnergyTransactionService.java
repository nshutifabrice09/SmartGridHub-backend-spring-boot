package com.microgrid.management.service;

import com.microgrid.management.model.EnergyTransaction;

import java.util.List;

public interface EnergyTransactionService {
    List<EnergyTransaction> getAllEnergyTransactions();
    EnergyTransaction getEnergyTransactionById(Long id);
    EnergyTransaction saveEnergyTransaction(EnergyTransaction energyTransaction, Long userId, Long receiverId);
    EnergyTransaction updateEnergyTransaction(Long id, EnergyTransaction energyTransaction);
    void removeEnergyTransactionById(Long id);
}
