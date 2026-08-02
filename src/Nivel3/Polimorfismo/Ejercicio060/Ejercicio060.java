package Nivel3.Polimorfismo.Ejercicio060;

abstract class Animal {
    public abstract void sonido();
}

class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("Perro: ¡guau!");
    }
}

class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("Gato: ¡miau!");
    }
}

class Vaca extends Animal {
    @Override
    public void sonido() {
        System.out.println("Vaca: ¡muuu!");
    }
}

public class Ejercicio060 {
    public static void ejecutarSonido(Animal animal) {
        animal.sonido();
    }

    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        ejecutarSonido(perro);
        ejecutarSonido(gato);
        ejecutarSonido(vaca);
    }
}
