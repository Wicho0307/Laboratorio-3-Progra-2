package Nivel3.Abstraccion.Ejercicio064;

abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        }
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

public class Ejercicio064 {
    public static void main(String[] args) {
        Figura figura = new Cuadrado(6);
        System.out.println("Área del cuadrado: " + figura.area());
    }
}
