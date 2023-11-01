package org.arosa.validador.models;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private String materiaInscripcion;
    private List<Materia>materias;
    private Alumno alumno;

    public Inscripcion(String materiaInscripcion, Alumno alumno) {
        this.materiaInscripcion = materiaInscripcion;
        this.alumno = alumno;
        this.materias = new ArrayList<>();
//        Se crea una lista de materias con sus respectivas materias correlativas
        Materia  disenio = new Materia("Diseño de Sistemas", "Paradigmas de Programación");
        Materia  paradigmas = new Materia("Paradigmas de Programación", "Algoritmos y Estructuras de Datos");
        Materia algoritmo = new Materia("Algoritmos y Estructuras de Datos", "NO_POSEE");
        materias.add(disenio);
        materias.add(paradigmas);
        materias.add(algoritmo);
    }

    public boolean aprobada(){
        if(getCorrelativa(materiaInscripcion) == "NO_POSEE"){
            System.out.println("La inscripción "+ materiaInscripcion + " se ha realizado correctamente!!");
            return true;
        }

        for(Materia  m : alumno.getMaterias()){
            if(m.getNombre() == getCorrelativa(materiaInscripcion) && m.getEstado() == EstadoMateria.ARPROBADA ){
                System.out.println("La inscripción "+ materiaInscripcion + " se ha realizado correctamente!!");
                return true;
            }
        }
        System.out.println("No se puede inscribir a la materia -"+ materiaInscripcion + "- sin antes aprobar -" + getCorrelativa(materiaInscripcion) + "-.");
        return false;
    }

    public String getCorrelativa(String materia){
        for(Materia m : materias){
            if(m.getNombre() == materia){
                return m.getCorrelativa();
            }
        }
        return null;
    }
}
