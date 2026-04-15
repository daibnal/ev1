package com.dairys.ev1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Incidencia {
    private static AtomicInteger counter = new AtomicInteger(1);
    private int id;

    @NotNull(message = "el estado debe ser ingresado")
    @NotBlank(message = "el estado no puede estar vacio")
    private String estado;

    @NotNull(message = "debe haber una breve descripcion")
    @NotBlank(message = "la descripcion no puede estar vacia")
    private String descripcion;

    @NotNull(message = "debe tener un nivel de prioridad");
    @NotBlank(message = "el nivel de prioridad no puede estar vacio")
    private int nivelPrioridad;

    @NotNull(message = "el usuario es obligatorio")
    @NotBlank(message = "el usuario no puede estar vacio")
    private String usuario;

    @NotNull(message = "el usuario es obligatorio")
    @NotBlank(message = "el usuario no puede estar vacio")
    private LocalDate fecha;

    public Incidencia(String estado, String descripcion, int nivelPrioridad, String usuario, LocalDate fecha){
        this.id = counter.getAndIncrement();
        this.estado = estado;
        this.descripcion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
        this.usuario = usuario;
        this.fecha = fecha;
    }
}
