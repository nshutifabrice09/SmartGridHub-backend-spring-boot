package com.microgrid.management.controller;

import com.microgrid.management.model.Alert;
import com.microgrid.management.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AlertController {

    private AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService){
        this.alertService = alertService;
    }

    @GetMapping("/alertServices")
    public List<Alert> alertList(){
        return alertService.getAllAlerts();
    }
}
