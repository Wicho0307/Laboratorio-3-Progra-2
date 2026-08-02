package Nivel3.Abstraccion.Ejercicio065;

abstract class Figura {
    public abstract double area();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

public class Ejercicio065 {
    public static void main(String[] args) {
        Figura figura = new Circulo(3);
        System.out.printf("Área del círculo: %.2f%n", figura.area());
    }
}
