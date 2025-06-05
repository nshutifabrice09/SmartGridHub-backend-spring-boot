package com.microgrid.management.controller;

import com.microgrid.management.service.OptimizationLogService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class OptimizationLogController {

    private final OptimizationLogService optimizationLogService;


    public OptimizationLogController(OptimizationLogService optimizationLogService) {
        this.optimizationLogService = optimizationLogService;
    }
}
