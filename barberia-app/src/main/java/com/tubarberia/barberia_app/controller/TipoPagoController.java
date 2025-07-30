package com.tubarberia.barberia_app.controller;

import com.tubarberia.barberia_app.model.TipoPago;
import com.tubarberia.barberia_app.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-pagos")
public class TipoPagoController {

    private final TipoPagoService tipoPagoService;

    public TipoPagoController(TipoPagoService tipoPagoService) {
        this.tipoPagoService = tipoPagoService;
    }

    @GetMapping
    public List<TipoPago> listarTiposPago(){
        return tipoPagoService.listarTodos();
    }
}
