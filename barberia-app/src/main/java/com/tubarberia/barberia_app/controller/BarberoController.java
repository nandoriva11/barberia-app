package com.tubarberia.barberia_app.controller;

import com.tubarberia.barberia_app.model.Barbero;
import com.tubarberia.barberia_app.repository.BarberoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/barberos")
public class BarberoController {

    private final BarberoRepository barberoRepository;

    public BarberoController(BarberoRepository barberoRepository) {
        this.barberoRepository = barberoRepository;
    }

    @GetMapping
    public List<Barbero> obtenerBarberos() {
        return barberoRepository.findAll();
    }
}
