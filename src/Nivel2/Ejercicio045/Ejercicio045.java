package Nivel2.Ejercicio045;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private List<Double> notas = new ArrayList<>();

    public void agregarNota(double nota) {
        if (nota < 0 || nota > 100) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 100.");
        }
        notas.add(nota);
    }

    public List<Double> getNotas() {
        return new ArrayList<>(notas);
    }
}

public class Ejercicio045 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        try {
            estudiante.agregarNota(105);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
