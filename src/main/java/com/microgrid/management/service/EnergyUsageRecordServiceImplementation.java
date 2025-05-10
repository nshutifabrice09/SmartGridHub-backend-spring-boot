package com.microgrid.management.service;

import com.microgrid.management.model.EnergyUsageRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyUsageRecordServiceImplementation implements EnergyUsageRecordService{

    @Override
    public List<EnergyUsageRecord> getAllEnergyUsageRecords() {
        return null;
    }

    @Override
    public EnergyUsageRecord getEnergyUsageRecordById(Long id) {
        return null;
    }

    @Override
    public EnergyUsageRecord saveEnergyUsageRecord(EnergyUsageRecord energyUsageRecord) {
        return null;
    }

    @Override
    public EnergyUsageRecord updateEnergyUsageRecord(Long id, EnergyUsageRecord energyUsageRecord) {
        return null;
    }

    @Override
    public void removeEnergyUsageRecordById(Long id) {

    }
}
