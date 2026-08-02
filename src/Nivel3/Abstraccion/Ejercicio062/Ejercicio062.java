package Nivel3.Abstraccion.Ejercicio062;

abstract class Figura {
    public abstract double area();
}

class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}

public class Ejercicio062 {
    public static void main(String[] args) {
        Figura figura = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + figura.area());
    }
}
