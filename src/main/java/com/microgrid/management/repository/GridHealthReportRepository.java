package com.microgrid.management.repository;

import com.microgrid.management.model.GridHealthReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridHealthReportRepository extends JpaRepository <GridHealthReport, Long> {
    GridHealthReport findGridHealthReportById(Long id);
}
