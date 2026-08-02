package Nivel2.Ejercicio044;

import java.util.ArrayList;
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

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    public void mostrarResultado() {
        double promedio = calcularPromedio();
        System.out.println("Estudiante: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Resultado: " + (promedio >= 60 ? "Aprobado" : "Reprobado"));
    }
}

public class Ejercicio044 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sofía");
        estudiante.agregarNota(75);
        estudiante.agregarNota(68);
        estudiante.agregarNota(82);
        estudiante.mostrarResultado();
    }
}
