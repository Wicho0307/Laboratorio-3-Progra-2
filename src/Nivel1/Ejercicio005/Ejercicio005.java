package Nivel1.Ejercicio005;

import java.util.Scanner;

public class Ejercicio005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            System.out.println("Resultado: " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        } finally {
            System.out.println("El programa ha finalizado.");
            scanner.close();
        }
    }
}
