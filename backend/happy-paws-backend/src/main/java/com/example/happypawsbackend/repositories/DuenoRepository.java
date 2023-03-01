package com.example.happypawsbackend.repositories;

import com.example.happypawsbackend.models.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DuenoRepository extends JpaRepository<Dueno, Integer> {

    Optional<Dueno> findOneByCorreo(String email);
}
