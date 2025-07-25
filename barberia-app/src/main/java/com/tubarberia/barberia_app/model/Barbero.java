package com.tubarberia.barberia_app.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "barbero", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Corte> cortes = new ArrayList();
}
