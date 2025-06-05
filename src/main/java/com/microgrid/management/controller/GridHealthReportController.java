package com.microgrid.management.controller;

import com.microgrid.management.service.GridHealthReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class GridHealthReportController {

    private final GridHealthReportService gridHealthReportService;

    @Autowired
    public GridHealthReportController(GridHealthReportService gridHealthReportService) {
        this.gridHealthReportService = gridHealthReportService;
    }
}
