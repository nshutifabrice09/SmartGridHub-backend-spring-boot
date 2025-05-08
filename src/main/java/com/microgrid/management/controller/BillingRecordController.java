package com.microgrid.management.controller;

import com.microgrid.management.model.BillingRecord;
import com.microgrid.management.service.BillingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BillingRecordController {

    private final BillingRecordService billingRecordService;

    @Autowired
    public BillingRecordController(BillingRecordService billingRecordService){
        this.billingRecordService = billingRecordService;
    }

    @GetMapping("/billingRecords")
    public List<BillingRecord> billingRecordList(){
        return billingRecordService.getAllBillingRecords();
    }

    @GetMapping("/billingRecord/{id}")
    public BillingRecord getBillingRecordById(@PathVariable ("id") Long id){
        return billingRecordService.getBillingRecordById(id);
    }

    @PostMapping("/billingRecord")
    public BillingRecord saveBillingRecord(@RequestBody BillingRecord billingRecord){
        return billingRecordService.saveBillingRecord(billingRecord);
    }

}
