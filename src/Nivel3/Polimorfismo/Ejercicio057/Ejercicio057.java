package Nivel3.Polimorfismo.Ejercicio057;

class Animal {
    public void sonido() {
        System.out.println("El animal emite un sonido.");
    }
}

class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("El gato maúlla: ¡miau!");
    }
}

public class Ejercicio057 {
    public static void main(String[] args) {
        Animal animal = new Gato();
        animal.sonido();
    }
}
