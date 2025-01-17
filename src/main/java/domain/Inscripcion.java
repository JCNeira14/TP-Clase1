package domain;

import java.util.List;

public class Inscripcion {
    private final Alumno alumno;
    private final List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public boolean aprobada(){
        for (Materia materia : materiasAInscribirse){
            if (!alumno.materiasAprobadas.containsAll(materia.correlativas)){
                return false;
            }
        }
        return true;
    }
}