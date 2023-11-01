package org.arosa.validador.models;

public class Materia {
    private String nombre;
    private String correlativa;
    private EstadoMateria estado;

    public String getCorrelativa() {
        return correlativa;
    }

    public void setCorrelativa(String correlativa) {
        this.correlativa = correlativa;
    }

    public Materia(String nombre, String correlativa) {
        this.nombre = nombre;
        this.correlativa = correlativa;
    }

    public EstadoMateria getEstado() {
        return estado;
    }

    public void setEstado(EstadoMateria estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
