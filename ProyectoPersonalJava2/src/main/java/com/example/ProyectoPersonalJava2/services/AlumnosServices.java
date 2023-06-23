package com.example.ProyectoPersonalJava2.services;
import com.example.ProyectoPersonalJava2.persistence.entities.Alumnos;
import com.example.ProyectoPersonalJava2.persistence.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlumnosServices {
    @Autowired
    AlumnoRepository alumnoRepository;

    public void guardarAlumnos(Alumnos alumnos){alumnoRepository.save(alumnos);}
    public List<Alumnos> retornartodoslosalumnos(){return alumnoRepository.findAll();}


}
