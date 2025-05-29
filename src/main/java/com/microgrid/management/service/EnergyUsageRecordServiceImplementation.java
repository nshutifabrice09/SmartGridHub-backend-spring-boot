package com.microgrid.management.service;

import com.microgrid.management.model.EnergyUsageRecord;
import com.microgrid.management.repository.EnergyUsageRecordRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyUsageRecordServiceImplementation implements EnergyUsageRecordService{
    private final EnergyUsageRecordRepository energyUsageRecordRepository;
    private final UserRepository userRepository;

    @Autowired
    public EnergyUsageRecordServiceImplementation(EnergyUsageRecordRepository energyUsageRecordRepository, UserRepository userRepository) {
        this.energyUsageRecordRepository = energyUsageRecordRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<EnergyUsageRecord> getAllEnergyUsageRecords() {
        return null;
    }

    @Override
    public EnergyUsageRecord getEnergyUsageRecordById(Long id) {
        return null;
    }

    @Override
    public EnergyUsageRecord saveEnergyUsageRecord(EnergyUsageRecord energyUsageRecord, Long userId) {
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
