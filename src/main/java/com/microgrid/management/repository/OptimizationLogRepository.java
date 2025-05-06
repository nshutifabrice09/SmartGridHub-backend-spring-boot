package com.microgrid.management.repository;

import com.microgrid.management.model.OptimizationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptimizationLogRepository extends JpaRepository <OptimizationLog, Long> {
}
