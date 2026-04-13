package com.dairys.ev1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dairys.ev1.model.Incidencia;
import com.dairys.ev1.repository.IncidenciaRepository;

@Service
public class IncidenciaService {
    private IncidenciaRepository incidenciaRepository;
    public List<Incidencia> verIncidencias(){
        return incidenciaRepository.leerIncidencias();
    }

    public Incidencia crearIncidencia(Incidencia i){
        return incidenciaRepository.agregarIncidencia(i);
    }

    public String encontrarUsuario(int id){
        return incidenciaRepository.buscarUsuario(id);
    }




}
