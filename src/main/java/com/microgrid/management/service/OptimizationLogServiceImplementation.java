package com.microgrid.management.service;

import com.microgrid.management.model.OptimizationLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptimizationLogServiceImplementation implements OptimizationLogService{
    @Override
    public List<OptimizationLog> getAllOptimizationLogs() {
        return null;
    }

    @Override
    public OptimizationLog getOptimizationLogById(Long id) {
        return null;
    }

    @Override
    public OptimizationLog saveOptimizationLog(OptimizationLog optimizationLog, Long microgridId) {
        return null;
    }

    @Override
    public OptimizationLog updateOptimizationLog(OptimizationLog optimizationLog, Long id) {
        return null;
    }

    @Override
    public void removeOptimizationLog(Long id) {

    }
}
