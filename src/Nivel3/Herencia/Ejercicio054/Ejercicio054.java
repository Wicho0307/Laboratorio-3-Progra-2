package Nivel3.Herencia.Ejercicio054;

class Animal {
    public void sonido() {
        System.out.println("El animal emite un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("El perro ladra: ¡guau, guau!");
    }
}

public class Ejercicio054 {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.sonido();
    }
}
