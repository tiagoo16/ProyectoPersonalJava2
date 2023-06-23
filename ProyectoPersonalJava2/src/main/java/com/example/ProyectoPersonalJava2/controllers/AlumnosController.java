package com.example.ProyectoPersonalJava2.controllers;

import com.example.ProyectoPersonalJava2.persistence.entities.Alumnos;
import com.example.ProyectoPersonalJava2.services.AlumnosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnosController {

    @Autowired
    AlumnosServices alumnosservice;

    @PostMapping("/crear")
    public void crear(@RequestBody Alumnos alumnos){alumnosservice.guardarAlumnos(alumnos);}

    @GetMapping("traertodoslosalumnos")
    public ResponseEntity<List<Alumnos>>traertodos(){return ResponseEntity.ok(alumnosservice.retornartodoslosalumnos());}
    }


