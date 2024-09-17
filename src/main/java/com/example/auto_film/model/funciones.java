package com.example.auto_film.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class funciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int funcion_id;
    private String titulo;
    private String descripcion;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime hora_inicio;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime hora_fin;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_funcion;
}
