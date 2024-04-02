package domain;

import java.util.List;

public class Alumno {
    private final String legajo;
    private final String nombre;
    public List<Materia> materiasAprobadas;

    public Alumno(String legajo, String nombre, List<Materia> materiasAprobadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }
}
