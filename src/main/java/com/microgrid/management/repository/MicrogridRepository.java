package com.microgrid.management.repository;

import com.microgrid.management.model.Microgrid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MicrogridRepository extends JpaRepository <Microgrid, Long> {
}
