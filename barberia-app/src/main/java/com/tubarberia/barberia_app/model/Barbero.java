package com.tubarberia.barberia_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="barberos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Barbero extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
