package com.tubarberia.barberia_app.service.impl;

import com.tubarberia.barberia_app.model.Corte;
import com.tubarberia.barberia_app.repository.CorteRepository;
import com.tubarberia.barberia_app.service.CorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorteServiceImpl implements CorteService {

    private final CorteRepository corteRepository;

    @Autowired
    public CorteServiceImpl(CorteRepository corteRepository) {
        this.corteRepository = corteRepository;
    }

    @Override
    public List<Corte> obtenerTodos() {
        return corteRepository.findAll();
    }

    @Override
    public Optional<Corte> obtenerPorId(Long id) {
        return corteRepository.findById(id);
    }

    @Override
    public Corte guardar(Corte corte) {
        return corteRepository.save(corte);
    }

    @Override
    public void eliminarPorId(Long id) {
        corteRepository.deleteById(id);
    }
}
