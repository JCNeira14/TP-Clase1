package domain;

import java.util.List;

public class Materia {
    private final Integer codigo;
    public List<Materia> correlativas;
    private final String nombre;

    public Materia(Integer codigo, List<Materia> correlativas, String nombre) {
        this.codigo = codigo;
        this.correlativas = correlativas;
        this.nombre = nombre;
    }
}
