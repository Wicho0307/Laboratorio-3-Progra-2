package Nivel1.Ejercicio022;

import java.util.Scanner;

public class Ejercicio022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int longitudMinima = 5;

        try {
            System.out.print("Ingrese un texto de al menos " + longitudMinima + " caracteres: ");
            String texto = scanner.nextLine();

            if (texto.length() < longitudMinima) {
                throw new IllegalArgumentException(
                        "El texto debe contener al menos " + longitudMinima + " caracteres.");
            }

            System.out.println("Longitud válida: " + texto.length());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
