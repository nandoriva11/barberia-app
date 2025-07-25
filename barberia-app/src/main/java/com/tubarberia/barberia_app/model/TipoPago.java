package com.tubarberia.barberia_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_pagos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
