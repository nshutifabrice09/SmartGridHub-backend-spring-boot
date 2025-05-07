package com.microgrid.management.service;

import com.microgrid.management.model.Alert;

import java.util.List;

public interface AlertService {
    List<Alert> getAllAlerts();
    Alert getAlertById(Long id);
    Alert saveAlert(Alert alert);
    Alert updateAlert(Long id, Alert alert);
    void removeAlertById(Long id);
}
