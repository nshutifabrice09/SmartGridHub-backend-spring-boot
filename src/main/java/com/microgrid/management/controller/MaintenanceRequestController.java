package com.microgrid.management.controller;

import com.microgrid.management.model.MaintenanceRequest;
import com.microgrid.management.service.MaintenanceRequestService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MaintenanceRequestController {

    private final MaintenanceRequestService maintenanceRequestService;

    @Autowired
    public MaintenanceRequestController(MaintenanceRequestService maintenanceRequestService) {
        this.maintenanceRequestService = maintenanceRequestService;
    }

    @PostMapping("/maintenanceRequest/{assetId}/{requestById}")
    public MaintenanceRequest save(@RequestBody MaintenanceRequest maintenanceRequest,
                                   @PathVariable ("assetId") Long assetId, @PathVariable ("requestById") Long requestById){
        return maintenanceRequestService.saveMaintenanceRequest(maintenanceRequest, assetId, requestById);
    }

    @GetMapping("/maintenanceRequests")
    public List<MaintenanceRequest> maintenanceRequestList(){
        return maintenanceRequestService.getAllMaintenanceRequests();
    }

    @GetMapping("/maintenanceRequest/{id}")
    public MaintenanceRequest getMaintenanceRequest(@PathVariable ("id") Long id){
        return maintenanceRequestService.getMaintenanceRequestById(id);
    }

    @PutMapping("/update/maintenanceRequest/{id}")
    public MaintenanceRequest update(@RequestBody MaintenanceRequest maintenanceRequest, @PathVariable ("id") Long id){
        return maintenanceRequestService.updateMaintenanceRequest(maintenanceRequest, id);
    }

    @DeleteMapping("/delete/maintenanceRequest/{id}")
    public void remove(@PathVariable ("id") Long id){
        maintenanceRequestService.removeMaintenanceRequest(id);
    }
}
