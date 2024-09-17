package com.example.auto_film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.auto_film.model.users;

@Repository
public interface usersRepository extends JpaRepository<users, Integer> {

}
