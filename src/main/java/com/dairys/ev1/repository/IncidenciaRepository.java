package com.dairys.ev1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dairys.ev1.model.Incidencia;

@Repository
public class IncidenciaRepository {
    private List<Incidencia> listIncidencias = new ArrayList<>();
    public List<Incidencia> leerIncidencias(){
        return listIncidencias;
    }

    public Incidencia agregarIncidencia(Incidencia i){
        listIncidencias.add(i);
        return i;
    }

    public Incidencia buscarUsuario(int id){
        for(Incidencia incidencia : listIncidencias){
            if(incidencia.getId() == id){
                return "El usuario de la incidencia es: " + incidencia.getUsuario();
            }
        }
        return "Incidencia no encontrada";
    }
}
