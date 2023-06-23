package com.example.ProyectoPersonalJava2.persistence.repository;
import com.example.ProyectoPersonalJava2.persistence.entities.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlumnoRepository extends JpaRepository<Alumnos, String> {
}
