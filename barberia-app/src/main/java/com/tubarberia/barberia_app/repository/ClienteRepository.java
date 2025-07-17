package com.tubarberia.barberia_app.repository;

import com.tubarberia.barberia_app.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
