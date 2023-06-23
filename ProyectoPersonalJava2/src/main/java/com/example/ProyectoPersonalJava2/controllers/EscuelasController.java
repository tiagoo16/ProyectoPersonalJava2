package com.example.ProyectoPersonalJava2.controllers;
import com.example.ProyectoPersonalJava2.persistence.entities.Escuelas;
import com.example.ProyectoPersonalJava2.services.EscuelasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/escuela")
public class EscuelasController {
    @Autowired
    EscuelasServices escuelasServices;
    @PostMapping("/crearescuelas")
    public void crear(@RequestBody Escuelas escuelas){escuelasServices.guardarescuelas(escuelas);}

    @GetMapping("traertodaslasescuelas")
    public ResponseEntity<List<Escuelas>>traertodo(){return ResponseEntity.ok(escuelasServices.retornartodaslasescuelas());}
}
