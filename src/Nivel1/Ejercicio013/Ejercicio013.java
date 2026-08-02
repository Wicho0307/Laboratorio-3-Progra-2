package Nivel1.Ejercicio013;

import java.util.Scanner;

public class Ejercicio013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número distinto de cero: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                throw new IllegalArgumentException("Se lanzó la excepción porque ingresó cero.");
            }

            System.out.println("Número aceptado: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
