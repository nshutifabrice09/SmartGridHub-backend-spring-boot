package com.microgrid.management.controller;

import com.microgrid.management.model.TariffPlan;
import com.microgrid.management.service.TariffPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TariffPlanController {

    private final TariffPlanService tariffPlanService;

    @Autowired
    public TariffPlanController (TariffPlanService tariffPlanService){
        this.tariffPlanService = tariffPlanService;
    }

    @GetMapping("/tariffPlans")
    public List<TariffPlan> tariffPlanList(){
        return tariffPlanService.getAllTariffPlans();
    }

    @GetMapping("/tariffPlan/{id}")
    public TariffPlan getTariffPlanById(@PathVariable ("id") Long id){
        return tariffPlanService.getTariffPlanById(id);
    }

    @PostMapping("/tariffPlan")
    public TariffPlan saveTariffPlan(@RequestBody TariffPlan tariffPlan){
        return tariffPlanService.saveTariffPlan(tariffPlan);
    }

}
