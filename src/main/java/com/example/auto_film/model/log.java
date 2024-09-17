package com.example.auto_film.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int log_id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private users usuario_id;
    private String evento;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecha_registro;
}
