package com.crudpropio.tarea3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudpropio.tarea3.models.Cita;
import com.crudpropio.tarea3.models.Dentista;
import com.crudpropio.tarea3.repository.CitaRepository;
import com.crudpropio.tarea3.repository.DentistaRepository;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepo;

    @Autowired
    private DentistaRepository dentistaRepo;

    public List<Cita> listar() {
        return citaRepo.findAll();
    }

    public Optional<Cita> buscarPorId(Long id) {
        return citaRepo.findById(id);
    }

    public List<Dentista> listarDentistas() {
        return dentistaRepo.findAll();
    }

    public Cita guardar(Cita cita) {
        Dentista dentista = dentistaRepo.findById(cita.getDentista().getId()).orElseThrow();
        cita.setDentista(dentista);

        if (cita.getEstado() == null || cita.getEstado().isBlank()) {
            cita.setEstado("PROGRAMADA");
        }
        return citaRepo.save(cita);
    }

    public void eliminar(Long id) {
        citaRepo.deleteById(id);
    }
}