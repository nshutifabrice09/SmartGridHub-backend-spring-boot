package com.microgrid.management.service;

import com.microgrid.management.model.OptimizationLog;

import java.util.List;

public interface OptimizationLogService {
    List<OptimizationLog> getAllOptimizationLogs();
    OptimizationLog getOptimizationLogById(Long id);
    OptimizationLog saveOptimizationLog(OptimizationLog optimizationLog, Long microgridId);
    OptimizationLog updateOptimizationLog(OptimizationLog optimizationLog, Long id);
    void removeOptimizationLog(Long id);
}
