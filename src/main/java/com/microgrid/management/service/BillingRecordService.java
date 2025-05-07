package com.microgrid.management.service;

import com.microgrid.management.model.BillingRecord;

import java.util.List;

public interface BillingRecordService {
    List<BillingRecord> getAllBillingRecords();
    BillingRecord getBillingRecordById(Long id);
    BillingRecord saveBillingRecord(BillingRecord billingRecord);
    BillingRecord updateBillingRecord(Long id, BillingRecord billingRecord);
    void removeBillingRecordById(Long id);

}
