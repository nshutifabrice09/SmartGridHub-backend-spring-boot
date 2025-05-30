package com.microgrid.management.service;

import com.microgrid.management.model.GridHealthReport;
import com.microgrid.management.repository.GridHealthReportRepository;
import com.microgrid.management.repository.MicrogridRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GridHealthReportServiceImplementation implements GridHealthReportService{
    private final GridHealthReportRepository gridHealthReportRepository;
    private final MicrogridRepository microgridRepository;

    @Autowired
    public GridHealthReportServiceImplementation(GridHealthReportRepository gridHealthReportRepository, MicrogridRepository microgridRepository) {
        this.gridHealthReportRepository = gridHealthReportRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<GridHealthReport> getAllGridHealthReports() {
        return null;
    }

    @Override
    public GridHealthReport getGridHealthReportById(Long id) {
        return null;
    }

    @Override
    public GridHealthReport saveGridHealthReport(GridHealthReport gridHealthReport, Long microgridId) {
        return null;
    }

    @Override
    public GridHealthReport updateGridHealthReport(Long id, GridHealthReport gridHealthReport) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
