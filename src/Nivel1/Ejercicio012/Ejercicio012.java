package Nivel1.Ejercicio012;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 100, 200, 300 };

        try {
            System.out.print("Ingrese un índice del arreglo: ");
            int indice = scanner.nextInt();
            System.out.print("Ingrese un divisor: ");
            int divisor = scanner.nextInt();

            System.out.println("Resultado: " + (numeros[indice] / divisor));
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar únicamente números enteros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el índice está fuera del arreglo.");
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }

        scanner.close();
    }
}
