package Nivel1.Ejercicio025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¡Hola! Bienvenido al menú.");
                        break;
                    case 2:
                        System.out.print("Ingrese el primer número: ");
                        int primero = scanner.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        int segundo = scanner.nextInt();
                        System.out.println("Suma: " + (primero + segundo));
                        break;
                    case 0:
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Error: la opción seleccionada no existe.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar únicamente números enteros.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
