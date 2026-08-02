package Nivel3.Polimorfismo.Ejercicio056;

class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void sonido() {
        System.out.println("El animal emite un sonido.");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
}

public class Ejercicio056 {
    public static void main(String[] args) {
        Animal animal = new Gato("Michi");
        System.out.println("Gato creado mediante una referencia Animal: " + animal.getNombre());
    }
}
