package com.microgrid.management.service;

import com.microgrid.management.model.BillingRecord;
import com.microgrid.management.model.User;
import com.microgrid.management.repository.BillingRecordRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingRecordServiceImplementation implements BillingRecordService{
    private final BillingRecordRepository billingRecordRepository;
    private final UserRepository userRepository;

    @Autowired
    public BillingRecordServiceImplementation(BillingRecordRepository billingRecordRepository, UserRepository userRepository) {
        this.billingRecordRepository = billingRecordRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<BillingRecord> getAllBillingRecords() {
        return billingRecordRepository.findAll();
    }

    @Override
    public BillingRecord getBillingRecordById(Long id) {
        return billingRecordRepository.findBillingRecordById(id);
    }

    @Override
    public BillingRecord saveBillingRecord(BillingRecord billingRecord, Long userId) {
        User user = userRepository.findUserById(userId);
        billingRecord.setUser(user);
        return billingRecordRepository.save(billingRecord);
    }

    @Override
    public BillingRecord updateBillingRecord(Long id, BillingRecord billingRecord) {
        BillingRecord existBillingRecord = billingRecordRepository.findBillingRecordById(id);
        if(existBillingRecord != null){
            existBillingRecord.setBillingDate(billingRecord.getBillingDate());
            existBillingRecord.setTotalKwhUsed(billingRecord.getTotalKwhUsed());
            existBillingRecord.setAmountDue(billingRecord.getAmountDue());
            return billingRecordRepository.save(existBillingRecord);
        }
        return null;
    }

    @Override
    public void removeBillingRecordById(Long id) {
        billingRecordRepository.deleteById(id);
    }
}
