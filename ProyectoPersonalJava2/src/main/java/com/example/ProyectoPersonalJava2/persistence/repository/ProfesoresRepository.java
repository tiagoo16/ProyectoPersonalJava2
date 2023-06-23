package com.example.ProyectoPersonalJava2.persistence.repository;
import com.example.ProyectoPersonalJava2.persistence.entities.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesoresRepository extends JpaRepository<Profesores,String> {
}
