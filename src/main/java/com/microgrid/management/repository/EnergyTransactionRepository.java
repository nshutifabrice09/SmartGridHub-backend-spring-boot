package com.microgrid.management.repository;

import com.microgrid.management.model.EnergyTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyTransactionRepository extends JpaRepository <EnergyTransaction, Long> {
    EnergyTransaction findByTransactionById(Long id);
}
