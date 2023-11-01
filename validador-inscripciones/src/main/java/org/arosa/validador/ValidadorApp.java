package org.arosa.validador;

import org.arosa.validador.models.Alumno;
import org.arosa.validador.models.EstadoMateria;
import org.arosa.validador.models.Inscripcion;
import org.arosa.validador.models.Materia;

public class ValidadorApp {
    public static void main(String[] args) {
        Materia  disenio = new Materia("Diseño de Sistemas", "Paradigmas de Programación");
        Materia  paradigmas = new Materia("Paradigmas de Programación", "Algoritmos y Estructuras de Datos");
        Materia algoritmo = new Materia("Algoritmos y Estructuras de Datos", "NO_POSEE");

        Alumno alumno = new Alumno("Carlos", 12345D);
        algoritmo.setEstado(EstadoMateria.ARPROBADA);
        alumno.setMaterias(algoritmo);

        System.out.println();
        System.out.println();

// Solicitud de inscripción sin tener aprobada la materia corelativa
        System.out.println("-------------- Realizando inscripción a Paradigmas de programación --------------");
        Inscripcion inscripcion1 = new Inscripcion("Diseño de Sistemas", alumno);
        inscripcion1.aprobada();

        System.out.println();
        System.out.println();

// Solicitud de inscripción aprobada la materia corelativa
        System.out.println("-------------- Realizando inscripción a Paradigmas de programación --------------");
        Inscripcion inscripcion2 = new Inscripcion("Paradigmas de Programación", alumno);
        inscripcion2.aprobada();

        System.out.println();
        System.out.println();

// Solicitud de inscripción aprobada la materia corelativa
        System.out.println("-------------- Realizando inscripción a Diseño de Sistemas --------------");

        Alumno alumno2 = new Alumno("Juan", 25236D);
        paradigmas.setEstado(EstadoMateria.DESAPROBADA);
        alumno2.setMaterias(paradigmas);

        Inscripcion inscripcion3 = new Inscripcion("Diseño de Sistemas", alumno2);
        inscripcion3.aprobada();

        System.out.println();
        System.out.println();
    }
}
