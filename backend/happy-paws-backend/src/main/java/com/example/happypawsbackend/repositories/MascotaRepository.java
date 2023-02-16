package com.example.happypawsbackend.repositories;

import com.example.happypawsbackend.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
}
