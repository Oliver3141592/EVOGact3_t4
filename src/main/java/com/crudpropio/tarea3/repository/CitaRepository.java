package com.crudpropio.tarea3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudpropio.tarea3.models.Cita;

public interface CitaRepository extends JpaRepository<Cita,Long> {
    
}
