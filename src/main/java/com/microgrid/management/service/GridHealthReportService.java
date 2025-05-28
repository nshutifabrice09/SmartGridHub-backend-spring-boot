package com.microgrid.management.service;

import com.microgrid.management.model.GridHealthReport;

import java.util.List;

public interface GridHealthReportService {
    List<GridHealthReport> getAllGridHealthReports();
    GridHealthReport getGridHealthReportById(Long id);
    GridHealthReport saveGridHealthReport(GridHealthReport gridHealthReport, Long microgridId);
    GridHealthReport updateGridHealthReport(Long id, GridHealthReport gridHealthReport);
    void removeById(Long id);
}
