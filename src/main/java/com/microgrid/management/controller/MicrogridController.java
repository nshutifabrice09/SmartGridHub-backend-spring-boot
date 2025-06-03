package com.microgrid.management.controller;

import com.microgrid.management.model.Microgrid;
import com.microgrid.management.service.MicrogridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MicrogridController {
    private final MicrogridService microgridService;

    @Autowired
    public MicrogridController(MicrogridService microgridService) {
        this.microgridService = microgridService;
    }

    @PostMapping("/microgrid")
    public Microgrid save(@RequestBody Microgrid microgrid){
        return microgridService.saveMicrogrid(microgrid);
    }

    @GetMapping("/microgrids")
    public List<Microgrid> microgridList(){
        return microgridService.getAllMicrogrids();
    }

    @GetMapping("/microgrid/{id}")
    public Microgrid getMicrogrid(@PathVariable ("id") Long id){
        return microgridService.getMicrogridById(id);
    }
}
