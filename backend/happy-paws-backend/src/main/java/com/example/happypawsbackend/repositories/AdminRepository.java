package com.example.happypawsbackend.repositories;

import com.example.happypawsbackend.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
