package com.microgrid.management.repository;

import com.microgrid.management.model.BillingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRecordRepository extends JpaRepository <BillingRecord, Long> {
    BillingRecord findBillingRecordById(Long id);
}
