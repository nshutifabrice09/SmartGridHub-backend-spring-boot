package com.microgrid.management.exception.controller;

import com.microgrid.management.model.Alert;
import com.microgrid.management.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AlertController {

    private AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService){
        this.alertService = alertService;
    }

    @GetMapping("/alerts")
    public List<Alert> alertList(){
        return alertService.getAllAlerts();
    }
    @GetMapping("/alert/{id}")
    public Alert getAlertById(@PathVariable ("id") Long id){
        return alertService.getAlertById(id);
    }

    @PostMapping("/alert")
    public Alert saveAlert(@RequestBody Alert alert){
        return alertService.saveAlert(alert);
    }
    @PutMapping("/update/alert/{id}")
    public Alert updateAlert(@PathVariable ("id") Long id, @RequestBody Alert alert){
        return alertService.updateAlert(id, alert);
    }

    @DeleteMapping("/delete/alert/{id}")
    public void removeAlertById(@PathVariable ("id") Long id){
        alertService.removeAlertById(id);
    }
}
