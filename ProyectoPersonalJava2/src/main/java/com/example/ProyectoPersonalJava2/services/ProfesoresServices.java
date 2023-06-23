package com.example.ProyectoPersonalJava2.services;
import com.example.ProyectoPersonalJava2.persistence.entities.Profesores;
import com.example.ProyectoPersonalJava2.persistence.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesoresServices {
    @Autowired
    ProfesoresRepository profesoresRepository;

    public void guardarprofesores(Profesores profesores){profesoresRepository.save(profesores);}
    public List<Profesores> retornartodoslosprofesores(){return profesoresRepository.findAll();}
}
