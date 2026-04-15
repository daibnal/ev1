package com.dairys.ev1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairys.ev1.model.Incidencia;
import com.dairys.ev1.service.IncidenciaService;

import jakarta.validation.Valid;

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
    

    @GetMapping("buscar/{id}")
    public Incidencia searchIncidencia(@PathVariable int id) {
        return incidenciaService.buscarIncidencia(id);
    }

    @GetMapping("buscarUsuario/{id}")
    public String searchUsuario(@PathVariable int id) {
        return incidenciaService.encontrarUsuario(id);
    }

    @DeleteMapping("eliminar/{id}")
        public String deleteInicdnecia(@PathVariable int id){
            return incidenciaService.eliminarIncidencia(id);
        }

    @PutMapping("actualizar/{id}")
        public Incidencia updateIncidencia(@Valid @PathVariable int id, @RequestBody Incidencia incidenciaCambiada){
            Incidencia i = incidenciaService.actualizarIncidencia(id, incidenciaCambiada){
                if(i != null){
                    return ResponseEntity.bad_Request(400);
                }
            }
            return ResponseEntity.ok(i);
        }

}





