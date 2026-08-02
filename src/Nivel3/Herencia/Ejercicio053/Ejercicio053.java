package Nivel3.Herencia.Ejercicio053;

class Animal {
    public void sonido() {
        System.out.println("El animal emite un sonido.");
    }
}

class Perro extends Animal {
}

public class Ejercicio053 {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.sonido();
    }
}
