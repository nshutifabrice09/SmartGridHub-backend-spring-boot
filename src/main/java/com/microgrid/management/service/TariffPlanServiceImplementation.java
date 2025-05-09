package com.microgrid.management.service;

import com.microgrid.management.model.TariffPlan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffPlanServiceImplementation implements TariffPlanService {
    @Override
    public List<TariffPlan> getAllTariffPlans() {
        return null;
    }

    @Override
    public TariffPlan getTariffPlanById(Long id) {
        return null;
    }

    @Override
    public TariffPlan saveTariffPlan(TariffPlan tariffPlan) {
        return null;
    }

    @Override
    public TariffPlan updateTariffPlan(Long id, TariffPlan tariffPlan) {
        return null;
    }

    @Override
    public void removeTariffPlanById(Long id) {

    }
}
