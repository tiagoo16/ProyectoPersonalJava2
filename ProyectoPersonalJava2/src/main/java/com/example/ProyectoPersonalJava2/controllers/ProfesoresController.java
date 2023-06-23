package com.example.ProyectoPersonalJava2.controllers;
import com.example.ProyectoPersonalJava2.persistence.entities.Profesores;
import com.example.ProyectoPersonalJava2.services.ProfesoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/profesor")
public class ProfesoresController {
    @Autowired
    ProfesoresServices profesoresServices;
    @PostMapping("/crear")
    public  void crear(@RequestBody Profesores profesores){profesoresServices.guardarprofesores(profesores);}

    @GetMapping("traertodoslosprofesores")
    public ResponseEntity<List<Profesores>>traertodos(){return ResponseEntity.ok(profesoresServices.retornartodoslosprofesores());}
}
