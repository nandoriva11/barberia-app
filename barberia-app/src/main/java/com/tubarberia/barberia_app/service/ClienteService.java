package com.tubarberia.barberia_app.service;

import com.tubarberia.barberia_app.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Cliente guardar(Cliente cliente);
    List<Cliente> obtenerClientes();
    Optional<Cliente> obtenerClientePorId(Long id);
    void eliminarClientePorId(Long id);
}
