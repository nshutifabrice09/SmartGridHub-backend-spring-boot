package com.microgrid.management.service;

import com.microgrid.management.model.EnergyUsageRecord;
import com.microgrid.management.model.User;
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
        return energyUsageRecordRepository.findAll();
    }

    @Override
    public EnergyUsageRecord getEnergyUsageRecordById(Long id) {
        return energyUsageRecordRepository.findEnergyUsageRecordById(id);
    }

    @Override
    public EnergyUsageRecord saveEnergyUsageRecord(EnergyUsageRecord energyUsageRecord, Long userId) {
        User user = userRepository.findUserById(userId);
        energyUsageRecord.setUser(user);
        return energyUsageRecordRepository.save(energyUsageRecord);
    }


    @Override
    public EnergyUsageRecord updateEnergyUsageRecord(Long id, EnergyUsageRecord energyUsageRecord) {
        EnergyUsageRecord existEnergyUsageRecord = energyUsageRecordRepository.findEnergyUsageRecordById(id);
        if(existEnergyUsageRecord != null){
            existEnergyUsageRecord.setTimestamp(energyUsageRecord.getTimestamp());
            existEnergyUsageRecord.setConsumption(energyUsageRecord.getConsumption());
            existEnergyUsageRecord.setProduction(energyUsageRecord.getProduction());
            return energyUsageRecordRepository.save(existEnergyUsageRecord);
        }
        return null;
    }

    @Override
    public void removeEnergyUsageRecordById(Long id) {
        energyUsageRecordRepository.deleteById(id);
    }
}
