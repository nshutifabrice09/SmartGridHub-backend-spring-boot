package com.microgrid.management.controller;

import com.microgrid.management.model.OptimizationLog;
import com.microgrid.management.service.OptimizationLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class OptimizationLogController {

    private final OptimizationLogService optimizationLogService;


    public OptimizationLogController(OptimizationLogService optimizationLogService) {
        this.optimizationLogService = optimizationLogService;
    }

    @PostMapping("/optimizationLog/{microgridId}")
    public OptimizationLog save(@RequestBody OptimizationLog optimizationLog, @PathVariable("microgridId") Long microgridId){
        return optimizationLogService.saveOptimizationLog(optimizationLog, microgridId);
    }

    @GetMapping("/optimizationLogs")
    public List<OptimizationLog> optimizationLogList(){
        return optimizationLogService.getAllOptimizationLogs();
    }

    @GetMapping("/optimizationLog/{id}")
    public OptimizationLog getOptimizationLog(@PathVariable ("id") Long id){
        return optimizationLogService.getOptimizationLogById(id);
    }

    @PutMapping("/update/optimizationLog/{id}")
    public OptimizationLog update(@RequestBody OptimizationLog optimizationLog, @PathVariable ("id")Long id){
        return optimizationLogService.updateOptimizationLog(optimizationLog, id);
    }
}
