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

    @ManyToOne
    @JoinColumn(name = "barbero_id") // Esta columna se usará como FK
    private Barbero barbero;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tipo_servicio_id")
    private TipoServicio tipoServicio;

    @ManyToOne
    @JoinColumn(name = "tipo_pago_id")
    private TipoPago tipoPago;

}
