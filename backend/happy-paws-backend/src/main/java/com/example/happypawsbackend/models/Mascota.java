package com.example.happypawsbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Mascota {
    @Id
    private int mId;
    private String nombre;
    private String tipo;
    private Date fechaNac;
    private String alergias;
}
