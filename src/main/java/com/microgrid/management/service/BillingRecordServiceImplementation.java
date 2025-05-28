package com.microgrid.management.service;

import com.microgrid.management.model.BillingRecord;
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
        return null;
    }

    @Override
    public BillingRecord getBillingRecordById(Long id) {
        return null;
    }

    @Override
    public BillingRecord saveBillingRecord(BillingRecord billingRecord, Long userId) {
        return null;
    }

    @Override
    public BillingRecord updateBillingRecord(Long id, BillingRecord billingRecord) {
        return null;
    }

    @Override
    public void removeBillingRecordById(Long id) {

    }
}
