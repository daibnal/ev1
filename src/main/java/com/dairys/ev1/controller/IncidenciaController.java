package com.dairys.ev1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairys.ev1.model.Incidencia;
import com.dairys.ev1.service.IncidenciaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("api/v1/incidencias")
public class IncidenciaController {
    @Autowired
    private IncidenciaService incidenciaService;
    
    @GetMapping
    public List<Incidencia> getIncidencias(){
        return incidenciaService.verIncidencias();
    }

    @PostMapping
    public Incidencia postIncidencia(@Valid @RequestBody Incidencia i) {
        return incidenciaService.crearIncidencia(i);
    }
    
    @GetMapping
    public String searchUsuario(@PathVariable int id) {
        return incidenciaService.encontrarUsuario(id);
    }
    

    
}
