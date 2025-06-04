package com.microgrid.management.service;

import com.microgrid.management.model.OptimizationLog;
import com.microgrid.management.repository.MicrogridRepository;
import com.microgrid.management.repository.OptimizationLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptimizationLogServiceImplementation implements OptimizationLogService{
    private final OptimizationLogRepository optimizationLogRepository;
    private final MicrogridRepository microgridRepository;

    @Autowired
    public OptimizationLogServiceImplementation(OptimizationLogRepository optimizationLogRepository, MicrogridRepository microgridRepository) {
        this.optimizationLogRepository = optimizationLogRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<OptimizationLog> getAllOptimizationLogs() {
        return optimizationLogRepository.findAll();
    }

    @Override
    public OptimizationLog getOptimizationLogById(Long id) {
        return optimizationLogRepository.findOptimizationLogById(id);
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
