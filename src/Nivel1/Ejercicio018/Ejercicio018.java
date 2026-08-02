package Nivel1.Ejercicio018;

import java.util.Scanner;

public class Ejercicio018 {
    public static double dividirSeguro(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("El divisor no puede ser cero.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        try {
            System.out.println("Resultado: " + dividirSeguro(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
