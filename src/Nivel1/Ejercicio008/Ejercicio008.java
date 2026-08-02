package Nivel1.Ejercicio008;

import java.util.Scanner;

public class Ejercicio008 {
    public static void dividir(int dividendo, int divisor) {
        try {
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error manejado en el método: no se puede dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        dividir(dividendo, divisor);
        scanner.close();
    }
}
