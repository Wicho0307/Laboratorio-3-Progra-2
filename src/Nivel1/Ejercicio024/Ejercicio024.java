package Nivel1.Ejercicio024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Inténtelo nuevamente.");
                scanner.nextLine();
            }
        }

        System.out.println("Número ingresado correctamente: " + numero);
        scanner.close();
    }
}
