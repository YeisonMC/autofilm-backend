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
public class pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pago_id;
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private reservas reserva;
    private double monto;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fechaPago;
}
