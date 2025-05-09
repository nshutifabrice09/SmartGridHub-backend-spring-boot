package com.microgrid.management.service;

import com.microgrid.management.model.TariffPlan;

import java.util.List;

public interface TariffPlanService {
    List<TariffPlan> getAllTariffPlans();
    TariffPlan getTariffPlanById(Long id);
    TariffPlan saveTariffPlan(TariffPlan tariffPlan);
    TariffPlan updateTariffPlan(Long id, TariffPlan tariffPlan);
    void removeTariffPlanById(Long id);

}
