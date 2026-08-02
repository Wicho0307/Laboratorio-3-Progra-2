package Nivel3.Polimorfismo.Ejercicio059;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void sonido() {
        System.out.println("El animal emite un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("El perro ladra: ¡guau!");
    }
}

class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("El gato maúlla: ¡miau!");
    }
}

class Vaca extends Animal {
    @Override
    public void sonido() {
        System.out.println("La vaca muge: ¡muuu!");
    }
}

public class Ejercicio059 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal animal : animales) {
            animal.sonido();
        }
    }
}
