package Nivel1.Ejercicio020;

public class Ejercicio020 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Este es un error generado de forma controlada.");
        } catch (RuntimeException e) {
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}
