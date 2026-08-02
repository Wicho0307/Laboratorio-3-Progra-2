package Nivel1.Ejercicio023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su año de nacimiento: ");
            int anioNacimiento = scanner.nextInt();
            System.out.println("Año ingresado: " + anioNacimiento);
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada: debe escribir un año con números enteros.");
        }

        scanner.close();
    }
}
