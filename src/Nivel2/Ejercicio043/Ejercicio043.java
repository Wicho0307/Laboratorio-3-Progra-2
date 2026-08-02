package Nivel2.Ejercicio043;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private List<Double> notas = new ArrayList<>();

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}

public class Ejercicio043 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.agregarNota(80);
        estudiante.agregarNota(90);
        estudiante.agregarNota(70);

        System.out.printf("Promedio: %.2f%n", estudiante.calcularPromedio());
    }
}
