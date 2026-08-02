package Nivel2.Ejercicio029;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class Ejercicio029 {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 25);
        System.out.println("Persona creada: " + persona.getNombre() + ", " + persona.getEdad() + " años.");
    }
}
