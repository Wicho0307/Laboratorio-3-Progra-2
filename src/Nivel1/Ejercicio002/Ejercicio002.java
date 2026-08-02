package Nivel1.Ejercicio002;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado correctamente: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número entero válido.");
        }

        scanner.close();
    }
}

