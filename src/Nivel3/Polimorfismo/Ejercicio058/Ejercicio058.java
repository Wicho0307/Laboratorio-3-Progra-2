package Nivel3.Polimorfismo.Ejercicio058;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
}

public class Ejercicio058 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Max"));
        animales.add(new Gato("Michi"));
        animales.add(new Perro("Luna"));

        System.out.println("Cantidad de animales en la lista: " + animales.size());
    }
}
