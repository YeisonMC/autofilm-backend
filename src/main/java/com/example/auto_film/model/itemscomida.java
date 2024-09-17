package com.example.auto_film.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class itemscomida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private categoriascomida categoria_id;
    private String nombre_item;
    private String descripcion;
    private double precio;
    private Boolean disponible;

}
