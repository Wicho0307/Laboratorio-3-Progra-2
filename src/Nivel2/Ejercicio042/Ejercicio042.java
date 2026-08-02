package Nivel2.Ejercicio042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Estudiante {
    private String nombre;
    private List<Double> notas = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public List<Double> getNotas() {
        return Collections.unmodifiableList(notas);
    }
}

public class Ejercicio042 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Pedro");
        estudiante.agregarNota(85);
        estudiante.agregarNota(92);
        estudiante.agregarNota(78);

        System.out.println("Notas privadas del estudiante: " + estudiante.getNotas());
    }
}
