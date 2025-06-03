package com.microgrid.management.service;

import com.microgrid.management.model.EnergyTransaction;
import com.microgrid.management.repository.EnergyTransactionRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyTransactionServiceImplementation implements EnergyTransactionService{
    private final EnergyTransactionRepository energyTransactionRepository;
    private final UserRepository userRepository;

    @Autowired
    public EnergyTransactionServiceImplementation(EnergyTransactionRepository energyTransactionRepository, UserRepository userRepository) {
        this.energyTransactionRepository = energyTransactionRepository;
        this.userRepository = userRepository;
    }
    @Override
    public List<EnergyTransaction> getAllEnergyTransactions() {
        return energyTransactionRepository.findAll();
    }

    @Override
    public EnergyTransaction getEnergyTransactionById(Long id) {
        return energyTransactionRepository.findByTransactionById(id);
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
