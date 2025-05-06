package com.microgrid.management.repository;

import com.microgrid.management.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository <Alert, Long> {
}
