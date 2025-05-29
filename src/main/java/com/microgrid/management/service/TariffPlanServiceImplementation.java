package com.microgrid.management.service;

import com.microgrid.management.model.TariffPlan;
import com.microgrid.management.repository.MicrogridRepository;
import com.microgrid.management.repository.TariffPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffPlanServiceImplementation implements TariffPlanService{
    private final TariffPlanRepository tariffPlanRepository;
    private final MicrogridRepository microgridRepository;

    @Autowired
    public TariffPlanServiceImplementation(TariffPlanRepository tariffPlanRepository, MicrogridRepository microgridRepository) {
        this.tariffPlanRepository = tariffPlanRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<TariffPlan> getAllTariffPlans() {
        return null;
    }

    @Override
    public TariffPlan getTariffPlanById(Long id) {
        return null;
    }

    @Override
    public TariffPlan saveTariffPlan(TariffPlan tariffPlan, Long microgridId) {
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
