package com.tubarberia.barberia_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cortes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Corte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreBarbero;
    private String cliente;
    private String dni;
    private String tipoServicio;
    private String tipoPago;
    
}
