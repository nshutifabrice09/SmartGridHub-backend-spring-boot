package com.microgrid.management.controller;

import com.microgrid.management.model.EnergyUsageRecord;
import com.microgrid.management.service.EnergyUsageRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnergyUsageRecordController {

    private final EnergyUsageRecordService energyUsageRecordService;

    @Autowired
    public EnergyUsageRecordController(EnergyUsageRecordService energyUsageRecordService) {
        this.energyUsageRecordService = energyUsageRecordService;
    }

    @PostMapping("/energyUsage/{userId}")
    public EnergyUsageRecord save(@RequestBody EnergyUsageRecord energyUsageRecord, @PathVariable ("userId") Long userId){
        return energyUsageRecordService.saveEnergyUsageRecord(energyUsageRecord, userId);
    }

    @GetMapping("/energyUsages")
    public List<EnergyUsageRecord> energyUsageRecordList(){
        return energyUsageRecordService.getAllEnergyUsageRecords();
    }

    @GetMapping("/energyUsage/{id}")
    public EnergyUsageRecord getEnergyUsageRecord(@PathVariable ("id") Long id){
        return energyUsageRecordService.getEnergyUsageRecordById(id);
    }

    @PutMapping("/update/energyUsage/{id}")
    public EnergyUsageRecord update(@PathVariable ("id") Long id, @RequestBody EnergyUsageRecord energyUsageRecord){
        return energyUsageRecordService.updateEnergyUsageRecord(id, energyUsageRecord);
    }

    @DeleteMapping("/delete/energyUsage/{id}")
    public void remove(@PathVariable ("id") Long id){
        energyUsageRecordService.removeEnergyUsageRecordById(id);
    }
}
