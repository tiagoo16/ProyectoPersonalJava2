package com.example.ProyectoPersonalJava2.services;
import com.example.ProyectoPersonalJava2.persistence.entities.Escuelas;
import com.example.ProyectoPersonalJava2.persistence.repository.EscuelasRepository;
import com.example.ProyectoPersonalJava2.persistence.repository.EscuelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EscuelasServices {
    @Autowired
    EscuelasRepository escuelasRepository;

    public void guardarescuelas(Escuelas escuelas){escuelasRepository.save(escuelas);}
    public List<Escuelas> retornartodaslasescuelas(){return escuelasRepository.findAll();}
}
