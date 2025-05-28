package com.microgrid.management.service;

import com.microgrid.management.model.Microgrid;

import java.util.List;

public interface MicrogridService {
    List<Microgrid> getAllMicrogrids();
    Microgrid getMicrogridById(Long id);
    Microgrid saveMicrogrid(Microgrid microgrid);
    Microgrid updateMicrogrid(Long id, Microgrid microgrid);
    void removeMicrogrid(Long id);
}
