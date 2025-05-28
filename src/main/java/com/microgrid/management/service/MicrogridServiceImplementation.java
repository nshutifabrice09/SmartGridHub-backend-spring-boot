package com.microgrid.management.service;

import com.microgrid.management.model.Microgrid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrogridServiceImplementation implements MicrogridService{
    @Override
    public List<Microgrid> getAllMicrogrids() {
        return null;
    }

    @Override
    public Microgrid getMicrogridById(Long id) {
        return null;
    }

    @Override
    public Microgrid saveMicrogrid(Microgrid microgrid) {
        return null;
    }

    @Override
    public Microgrid updateMicrogrid(Long id, Microgrid microgrid) {
        return null;
    }

    @Override
    public void removeMicrogrid(Long id) {

    }
}
