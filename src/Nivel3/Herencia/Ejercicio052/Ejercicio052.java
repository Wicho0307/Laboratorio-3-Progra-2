package Nivel3.Herencia.Ejercicio052;

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

public class Ejercicio052 {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        System.out.println("El perro heredó el nombre: " + perro.getNombre());
    }
}
