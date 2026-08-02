package Nivel1.Ejercicio004;

import java.util.Scanner;

public class Ejercicio004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            System.out.println("Resultado: " + (dividendo / divisor));
        } catch (ArithmeticException e) {
            System.out.println("No fue posible realizar la operación: el divisor no puede ser cero.");
        }

        scanner.close();
    }
}
