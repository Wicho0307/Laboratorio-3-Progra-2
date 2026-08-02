package Nivel3.Herencia.Ejercicio051;

class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Ejercicio051 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal genérico");
        System.out.println("Animal creado: " + animal.getNombre());
    }
}
