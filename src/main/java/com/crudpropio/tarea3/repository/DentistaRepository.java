package com.crudpropio.tarea3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudpropio.tarea3.models.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista, Long> {

}