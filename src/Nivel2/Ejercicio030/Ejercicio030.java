package Nivel2.Ejercicio030;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Ejercicio030 {
    public static void main(String[] args) {
        Persona persona = new Persona("María", 30);
        persona.mostrarDatos();
    }
}
