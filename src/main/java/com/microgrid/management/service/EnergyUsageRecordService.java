package com.microgrid.management.service;

import com.microgrid.management.model.EnergyUsageRecord;

import java.util.List;

public interface EnergyUsageRecordService {
    List<EnergyUsageRecord> getAllEnergyUsageRecords();
    EnergyUsageRecord getEnergyUsageRecordById(Long id);
    EnergyUsageRecord saveEnergyUsageRecord(EnergyUsageRecord energyUsageRecord, Long userId);
    EnergyUsageRecord updateEnergyUsageRecord(Long id, EnergyUsageRecord energyUsageRecord);
    void removeEnergyUsageRecordById(Long id);
}
