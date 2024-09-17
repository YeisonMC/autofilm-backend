package com.example.auto_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.auto_film.model.log;

@Repository
public interface logRepository extends JpaRepository<log, Integer> {

}
