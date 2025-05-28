package com.microgrid.management.service;

import com.microgrid.management.model.EnergyTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyTransactionServiceImplementation implements EnergyTransactionService{
    @Override
    public List<EnergyTransaction> getAllEnergyTransactions() {
        return null;
    }

    @Override
    public EnergyTransaction getEnergyTransactionById(Long id) {
        return null;
    }

    @Override
    public EnergyTransaction saveEnergyTransaction(EnergyTransaction energyTransaction, Long userId, Long receiverId) {
        return null;
    }


    @Override
    public EnergyTransaction updateEnergyTransaction(Long id, EnergyTransaction energyTransaction) {
        return null;
    }

    @Override
    public void removeEnergyTransactionById(Long id) {

    }
}
