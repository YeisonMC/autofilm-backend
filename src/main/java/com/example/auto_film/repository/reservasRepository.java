package com.example.auto_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.auto_film.model.reservas;

@Repository
public interface reservasRepository extends JpaRepository<reservas, Integer> {

}
