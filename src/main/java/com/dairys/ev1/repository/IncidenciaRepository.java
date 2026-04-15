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

    public Incidencia encontrarIncidencia(int id){
        for(Incidencia incidencia : listIncidencias){
            if(incidencia.getId() == id){
                return incidencia;
            }
        }
        return null;
    }

    public String buscarUsuario(int id){
        for(Incidencia incidencia : listIncidencias){
            if(incidencia.getId() == id){
                return "El usuario de la incidencia es: " + incidencia.getUsuario();
            }
        }
        return "Incidencia no encontrada";
    }

    public Incidencia cambiarIncidencia(int id, Incidencia incidenciaCambiada){
        for(Incidencia incidencia : listIncidencias){
            if(incidencia.getId() == id){
            incidencia.setEstado(incidenciaCambiada.getEstado());
            incidencia.setDescripcion(incidenciaCambiada.getDescripcion());
            incidencia.setNivelPrioridad(incidenciaCambiada.getNivelPrioridad());
            incidencia.setUsuario(incidenciaCambiada.getUsuario());
            incidencia.setFecha(incidenciaCambiada.getFecha());
            return incidenciaCambiada;
            }
        }
        return null;
    }

    public String quitarIncidencia(int id){
        for(Incidencia incidencia : listIncidencias){
            if(incidencia.getId() == id){
                listIncidencias.remove(incidencia);
                return "Incidencia cambiada";
            }
        }
        return("incidencia no encontrada");
    }

}
