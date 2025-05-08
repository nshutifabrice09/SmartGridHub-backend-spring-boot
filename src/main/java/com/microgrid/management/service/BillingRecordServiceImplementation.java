package com.microgrid.management.service;

import com.microgrid.management.model.BillingRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingRecordServiceImplementation implements BillingRecordService{
    @Override
    public List<BillingRecord> getAllBillingRecords() {
        return null;
    }

    @Override
    public BillingRecord getBillingRecordById(Long id) {
        return null;
    }

    @Override
    public BillingRecord saveBillingRecord(BillingRecord billingRecord) {
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
