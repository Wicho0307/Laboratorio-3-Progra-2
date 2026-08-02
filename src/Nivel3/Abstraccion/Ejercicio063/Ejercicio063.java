package Nivel3.Abstraccion.Ejercicio063;

abstract class Figura {
    public abstract double area();
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
}

public class Ejercicio063 {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4);
        System.out.println("Se creó un cuadrado de lado 4.");
        System.out.println("Área: " + cuadrado.area());
    }
}
