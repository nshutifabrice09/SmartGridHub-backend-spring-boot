package com.microgrid.management.service;

import com.microgrid.management.model.Alert;
import com.microgrid.management.repository.AlertRepository;
import com.microgrid.management.repository.MicrogridRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImplementation implements AlertService{

    private final AlertRepository alertRepository;
    private final MicrogridRepository microgridRepository;

    @Autowired
    public AlertServiceImplementation(AlertRepository alertRepository, MicrogridRepository microgridRepository) {
        this.alertRepository = alertRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<Alert> getAllAlerts() {
        return null;
    }

    @Override
    public Alert getAlertById(Long id) {
        return null;
    }

    @Override
    public Alert saveAlert(Alert alert, Long microgridId) {
        return null;
    }


    @Override
    public Alert updateAlert(Long id, Alert alert) {
        return null;
    }

    @Override
    public void removeAlertById(Long id) {

    }
}
