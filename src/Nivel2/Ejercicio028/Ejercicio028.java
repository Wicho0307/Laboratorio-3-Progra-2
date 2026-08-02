package Nivel2.Ejercicio028;

class Persona {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}

public class Ejercicio028 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        try {
            persona.setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
