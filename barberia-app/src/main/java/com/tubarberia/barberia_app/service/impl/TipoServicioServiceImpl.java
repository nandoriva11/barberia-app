package com.tubarberia.barberia_app.service.impl;

import com.tubarberia.barberia_app.model.TipoServicio;
import com.tubarberia.barberia_app.repository.TipoServicioRepository;
import com.tubarberia.barberia_app.service.TipoServicioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServicioServiceImpl implements TipoServicioService {

    private final TipoServicioRepository tipoServicioRepository;

    public TipoServicioServiceImpl(TipoServicioRepository tipoServicioRepository) {
        this.tipoServicioRepository = tipoServicioRepository;
    }

    @Override
    public List<TipoServicio> listarTodos() {
        return tipoServicioRepository.findAll();
    }
}
