package com.microgrid.management.controller;

import com.microgrid.management.model.BillingRecord;
import com.microgrid.management.service.BillingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BillingRecordController {

    private final BillingRecordService billingRecordService;

    @Autowired
    public BillingRecordController(BillingRecordService billingRecordService){
        this.billingRecordService = billingRecordService;
    }

    @GetMapping("/billings")
    public List<BillingRecord> billingRecordList(){
        return billingRecordService.getAllBillingRecords();
    }
}
