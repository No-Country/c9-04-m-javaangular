package com.example.happypawsbackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Dueno {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String correo;
    private String password;
    private int enabled = 1;
    private int celular;

    @OneToMany(targetEntity = Consulta.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Consulta> consultas;

    @OneToMany(targetEntity = Mascota.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "dm_fk", referencedColumnName = "id")
    private List<Mascota> mascotas;
}
