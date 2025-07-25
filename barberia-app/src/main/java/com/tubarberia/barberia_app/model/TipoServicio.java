package com.tubarberia.barberia_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_servicios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

}
