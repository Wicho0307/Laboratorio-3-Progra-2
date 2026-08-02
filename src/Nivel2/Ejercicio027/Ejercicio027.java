package Nivel2.Ejercicio027;

class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Ejercicio027 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Ana");
        persona.setEdad(20);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
