package Nivel3.Integracion.Ejercicio066;

import java.util.ArrayList;
import java.util.List;

abstract class Figura {
    public abstract String getNombre();
}

class Cuadrado extends Figura {
    @Override
    public String getNombre() {
        return "Cuadrado";
    }
}

class Circulo extends Figura {
    @Override
    public String getNombre() {
        return "Círculo";
    }
}

class Triangulo extends Figura {
    @Override
    public String getNombre() {
        return "Triángulo";
    }
}

public class Ejercicio066 {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado());
        figuras.add(new Circulo());
        figuras.add(new Triangulo());

        System.out.println("Figuras almacenadas en la lista:");
        for (Figura figura : figuras) {
            System.out.println("- " + figura.getNombre());
        }
    }
}
