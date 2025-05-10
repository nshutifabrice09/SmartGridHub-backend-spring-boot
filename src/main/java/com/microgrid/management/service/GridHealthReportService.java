package com.microgrid.management.service;

import com.microgrid.management.model.GridHealthReport;

import java.util.List;

public interface GridHealthReportService {
    List<GridHealthReport> getAllGridHealthReports();
    GridHealthReport getGridHealthReportById(Long id);
    GridHealthReport saveGridHealthReport(GridHealthReport gridHealthReport);
    GridHealthReport updateGridHealthReport(Long id, GridHealthReport gridHealthReport);
}
