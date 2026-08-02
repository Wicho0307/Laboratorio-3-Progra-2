package Nivel3.Integracion.Ejercicio067;

import java.util.ArrayList;
import java.util.List;

abstract class Figura {
    public abstract double area();

    public abstract String getNombre();
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public String getNombre() {
        return "Cuadrado";
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getNombre() {
        return "Círculo";
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String getNombre() {
        return "Triángulo";
    }
}

public class Ejercicio067 {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));
        figuras.add(new Triangulo(6, 5));

        double areaTotal = 0;
        for (Figura figura : figuras) {
            double area = figura.area();
            areaTotal += area;
            System.out.printf("Área de %s: %.2f%n", figura.getNombre(), area);
        }

        System.out.printf("Área total: %.2f%n", areaTotal);
    }
}
