package com.example.auto_film.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class categoriascomida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoria_id;
    private String nombre_categoria;
}
