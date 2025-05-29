package com.microgrid.management.service;

import com.microgrid.management.model.Microgrid;
import com.microgrid.management.repository.MicrogridRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrogridServiceImplementation implements MicrogridService{
    private final MicrogridRepository microgridRepository;

    @Autowired
    public MicrogridServiceImplementation(MicrogridRepository microgridRepository) {
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<Microgrid> getAllMicrogrids() {
        return microgridRepository.findAll();
    }

    @Override
    public Microgrid getMicrogridById(Long id) {
        return microgridRepository.findMicrogridById(id);
    }

    @Override
    public Microgrid saveMicrogrid(Microgrid microgrid) {
        return microgridRepository.save(microgrid);
    }

    @Override
    public Microgrid updateMicrogrid(Long id, Microgrid microgrid) {
        Microgrid existMicrogrid = microgridRepository.findMicrogridById(id);
        if(existMicrogrid != null){
            existMicrogrid.setName(microgrid.getName());
            existMicrogrid.setLocation(microgrid.getLocation());
            existMicrogrid.setTotalCapacity(microgrid.getTotalCapacity());
            return microgridRepository.save(existMicrogrid);
        }
        return null;
    }

    @Override
    public void removeMicrogrid(Long id) {
        microgridRepository.deleteById(id);
    }
}
