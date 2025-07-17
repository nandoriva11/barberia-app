package com.tubarberia.barberia_app.repository;

import com.tubarberia.barberia_app.model.Corte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorteRepository extends JpaRepository<Corte, Long> {
}
