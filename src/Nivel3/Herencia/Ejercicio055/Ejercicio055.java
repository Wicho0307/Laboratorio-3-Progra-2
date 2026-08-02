package Nivel3.Herencia.Ejercicio055;

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

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void sonido() {
        System.out.println("El perro ladra: ¡guau, guau!");
    }
}

public class Ejercicio055 {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Labrador");

        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        perro.sonido();
    }
}
