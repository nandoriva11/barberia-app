package com.tubarberia.barberia_app.controller;

import com.tubarberia.barberia_app.model.Cliente;
import com.tubarberia.barberia_app.model.Corte;
import com.tubarberia.barberia_app.service.CorteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cortes")
public class CorteController {

    private final CorteService corteService;

    public CorteController(CorteService corteService) {
        this.corteService = corteService;
    }

    @GetMapping
    public List<Corte> obtenerTodos() {
        return corteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Corte> obtenerPorId(@PathVariable Long id) {
        return corteService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Corte> crear(@RequestBody Corte corte) {
        System.out.println("Corte Recibido:" + corte);
        System.out.println("Barbero: " + corte.getNombreBarbero());
        System.out.println("Cliente: " + corte.getCliente());
        System.out.println("DNI: " + corte.getDni());
        System.out.println("Servicio: " + corte.getTipoServicio());
        System.out.println("Pago: " + corte.getTipoPago());

        Corte nuevo = corteService.guardar(corte);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        corteService.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
