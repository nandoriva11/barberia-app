package com.tubarberia.barberia_app.controller;

import com.tubarberia.barberia_app.model.TipoServicio;
import com.tubarberia.barberia_app.service.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-servicio")
public class TipoServicioController {

    private final TipoServicioService tipoServicioService;

    public TipoServicioController(TipoServicioService tipoServicioService) {
        this.tipoServicioService = tipoServicioService;
    }

    @GetMapping
    public List<TipoServicio> listarTiposServicio() {
        return tipoServicioService.listarTodos();
    }
}
