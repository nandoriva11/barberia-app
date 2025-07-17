package com.tubarberia.barberia_app.service;

import com.tubarberia.barberia_app.model.Corte;

import java.util.List;
import java.util.Optional;

public interface CorteService {

    List<Corte> obtenerTodos();

    Optional<Corte> obtenerPorId(Long id);

    Corte guardar(Corte corte);

    void eliminarPorId(Long id);
}
