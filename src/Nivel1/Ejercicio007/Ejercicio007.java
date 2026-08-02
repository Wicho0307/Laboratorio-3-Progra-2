package Nivel1.Ejercicio007;

import java.util.Scanner;

public class Ejercicio007 {
    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        try {
            validarNumero(numero);
            System.out.println("El número es válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
