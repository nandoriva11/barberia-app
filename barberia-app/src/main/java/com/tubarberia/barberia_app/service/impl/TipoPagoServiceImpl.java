package com.tubarberia.barberia_app.service.impl;

import com.tubarberia.barberia_app.model.TipoPago;
import com.tubarberia.barberia_app.repository.TipoPagoRepository;
import com.tubarberia.barberia_app.service.TipoPagoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoServiceImpl implements TipoPagoService {

    private final TipoPagoRepository tipoPagoRepository;

    public TipoPagoServiceImpl(TipoPagoRepository tipoPagoRepository) {
        this.tipoPagoRepository = tipoPagoRepository;
    }


    @Override
    public List<TipoPago> listarTodos() {
        return tipoPagoRepository.findAll();
    }
}
