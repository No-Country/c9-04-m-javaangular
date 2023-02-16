package com.example.happypawsbackend.repositories;

import com.example.happypawsbackend.models.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuenoRepository extends JpaRepository<Dueno, Integer> {
}
