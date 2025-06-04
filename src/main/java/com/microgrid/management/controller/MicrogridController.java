package com.microgrid.management.controller;

import com.microgrid.management.service.MicrogridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class MicrogridController {

    private final MicrogridService microgridService;

    @Autowired
    public MicrogridController(MicrogridService microgridService) {
        this.microgridService = microgridService;
    }
}
