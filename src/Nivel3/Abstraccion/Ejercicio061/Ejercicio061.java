package Nivel3.Abstraccion.Ejercicio061;

abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class Ejercicio061 {
    public static void main(String[] args) {
        System.out.println("Se creó la clase abstracta Figura.");
        System.out.println("Una clase abstracta no se puede instanciar directamente.");
    }
}
