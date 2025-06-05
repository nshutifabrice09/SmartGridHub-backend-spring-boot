package com.microgrid.management.controller;

import com.microgrid.management.model.GridHealthReport;
import com.microgrid.management.service.GridHealthReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class GridHealthReportController {

    private final GridHealthReportService gridHealthReportService;

    @Autowired
    public GridHealthReportController(GridHealthReportService gridHealthReportService) {
        this.gridHealthReportService = gridHealthReportService;
    }

    @PostMapping("/gridHealthReport/{microgridId}")
    public GridHealthReport save(@RequestBody GridHealthReport gridHealthReport, @PathVariable ("microgridId") Long microgridId){
        return gridHealthReportService.saveGridHealthReport(gridHealthReport, microgridId);
    }

    @GetMapping("/gridHealthReports")
    public List<GridHealthReport> gridHealthReportList(){
        return gridHealthReportService.getAllGridHealthReports();
    }

    @GetMapping("/gridHealthReport/{id}")
    public GridHealthReport getGridHealthReport(@PathVariable ("id") Long id){
        return gridHealthReportService.getGridHealthReportById(id);
    }

    @PutMapping("/update/gridHealthReport/{id}")
    public GridHealthReport updateGridHealthReport(@PathVariable ("id") Long id, @RequestBody GridHealthReport gridHealthReport){
        return gridHealthReportService.updateGridHealthReport(id, gridHealthReport);
    }

    @DeleteMapping("/delete/gridHealthReport/{id}")
    public void remove(@PathVariable ("id") Long id){
        gridHealthReportService.removeById(id);
    }

}
