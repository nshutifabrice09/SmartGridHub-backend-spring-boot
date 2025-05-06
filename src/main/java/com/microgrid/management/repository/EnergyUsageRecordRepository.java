package com.microgrid.management.repository;

import com.microgrid.management.model.EnergyUsageRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyUsageRecordRepository extends JpaRepository <EnergyUsageRecord, Long> {
}
