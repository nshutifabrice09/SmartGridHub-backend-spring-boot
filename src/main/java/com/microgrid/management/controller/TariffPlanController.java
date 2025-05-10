package com.microgrid.management.controller;

import com.microgrid.management.service.TariffPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class TariffPlanController {

    private final TariffPlanService tariffPlanService;

    @Autowired
    public TariffPlanController (TariffPlanService tariffPlanService){
        this.tariffPlanService = tariffPlanService;
    }
}
