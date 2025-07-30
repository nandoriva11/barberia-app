package com.tubarberia.barberia_app.service.impl;

import com.tubarberia.barberia_app.model.Barbero;
import com.tubarberia.barberia_app.repository.BarberoRepository;
import com.tubarberia.barberia_app.service.BarberoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberoServiceImpl implements BarberoService {

    private BarberoRepository barberoRepository;

    public BarberoServiceImpl(BarberoRepository barberoRepository) {
        this.barberoRepository = barberoRepository;
    }

    @Override
    public List<Barbero> obtenerBarberos() {
        return barberoRepository.findAll();
    }
}
