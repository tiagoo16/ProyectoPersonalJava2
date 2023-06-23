package com.example.ProyectoPersonalJava2.persistence.entities;
import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;
    @Column
    private String nombre;



    @Column
    private Integer edad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }



}
