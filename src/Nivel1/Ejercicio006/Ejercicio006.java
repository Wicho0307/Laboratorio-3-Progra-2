package Nivel1.Ejercicio006;

import java.util.Scanner;

public class Ejercicio006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número positivo: ");
            int numero = scanner.nextInt();

            if (numero <= 0) {
                throw new IllegalArgumentException("El número debe ser mayor que cero.");
            }

            System.out.println("Número válido: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
