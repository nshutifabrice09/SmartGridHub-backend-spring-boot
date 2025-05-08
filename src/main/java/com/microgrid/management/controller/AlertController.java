package com.microgrid.management.controller;

import com.microgrid.management.model.Alert;
import com.microgrid.management.model.User;
import com.microgrid.management.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
}
