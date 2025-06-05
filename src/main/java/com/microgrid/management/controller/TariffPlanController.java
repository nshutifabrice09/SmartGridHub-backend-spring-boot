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

    @PostMapping("/tariffPlan/{microgridId}")
    public TariffPlan save(@RequestBody TariffPlan tariffPlan, @PathVariable ("microgridId") Long microgridId){
        return tariffPlanService.saveTariffPlan(tariffPlan, microgridId);
    }

    @PutMapping("/update/tariffPlan/{id}")
    public TariffPlan updateTariffPlan(@PathVariable ("id") Long id, @RequestBody TariffPlan tariffPlan){
        return tariffPlanService.updateTariffPlan(id, tariffPlan);
    }

    @DeleteMapping("/delete/tariffPlan/{id}")
    public void removeTariffPlanById(@PathVariable ("id") Long id){
        tariffPlanService.removeTariffPlanById(id);
    }

}
