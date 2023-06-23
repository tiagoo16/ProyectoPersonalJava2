package com.example.ProyectoPersonalJava2.persistence.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Escuelas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)

    private long id;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "profesores_id")
    private Profesores profesores;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Profesores getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }
}
