package Nivel1.Ejercicio016;

import java.util.Scanner;

public class Ejercicio016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un texto: ");
            String texto = scanner.nextLine();

            if (texto.trim().isEmpty()) {
                throw new IllegalArgumentException("El texto no puede estar vacío.");
            }

            System.out.println("Texto válido: " + texto);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
