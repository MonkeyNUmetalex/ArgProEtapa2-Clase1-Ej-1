package org.arosa.validador.models;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private double lejago;

    private List<Materia> materias;

    public Alumno(String nombre, double lejago) {
        this.nombre = nombre;
        this.lejago = lejago;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLejago() {
        return lejago;
    }

    public void setLejago(double lejago) {
        this.lejago = lejago;
    }

    public void setMaterias(Materia materia) {
        this.materias.add(materia);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
