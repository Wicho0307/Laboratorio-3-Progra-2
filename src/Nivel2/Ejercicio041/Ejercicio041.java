package Nivel2.Ejercicio041;

class Estudiante {
    private String nombre;
    private String carne;

    public Estudiante(String nombre, String carne) {
        this.nombre = nombre;
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarne() {
        return carne;
    }
}

public class Ejercicio041 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lucía", "2026001");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Carné: " + estudiante.getCarne());
    }
}
