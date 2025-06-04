package com.microgrid.management.service;

import com.microgrid.management.model.Microgrid;
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
        return tariffPlanRepository.findAll();
    }

    @Override
    public TariffPlan getTariffPlanById(Long id) {
        return tariffPlanRepository.findTariffPlanById(id);
    }

    @Override
    public TariffPlan saveTariffPlan(TariffPlan tariffPlan, Long microgridId) {
        Microgrid microgrid = microgridRepository.findMicrogridById(microgridId);
        tariffPlan.setMicrogrid(microgrid);
        return tariffPlanRepository.save(tariffPlan);
    }

    @Override
    public TariffPlan updateTariffPlan(Long id, TariffPlan tariffPlan) {
        TariffPlan existTariffPlan = tariffPlanRepository.findTariffPlanById(id);
        if(existTariffPlan != null){
            existTariffPlan.setName(tariffPlan.getName());
            existTariffPlan.setRatePerKwh(tariffPlan.getRatePerKwh());
            existTariffPlan.setStartTime(tariffPlan.getStartTime());
            existTariffPlan.setEndTime(tariffPlan.getEndTime());
            return tariffPlanRepository.save(existTariffPlan);
        }
        return null;
    }

    @Override
    public void removeTariffPlanById(Long id) {
        tariffPlanRepository.deleteById(id);
    }
}
