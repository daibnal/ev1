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

    public Incidencia buscarIncidencia(int id){
        return incidenciaRepository.encontrarIncidencia(id);
    }

    public String encontrarUsuario(int id){
        return incidenciaRepository.buscarUsuario(id);
    }

    public String eliminarIncidencia(int id){
        return incidenciaRepository.quitarIncidencia(id);
    }

    public Incidencia actualizarIncidencia(int id, Incidencia incidenciaCambiada){
        return incidenciaRepository.cambiarIncidencia(id, incidenciaCambiada);
    }


}
