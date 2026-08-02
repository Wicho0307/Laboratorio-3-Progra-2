package Nivel1.Ejercicio011;

import java.util.Scanner;

public class Ejercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 10, 20, 30, 40, 50 };

        try {
            System.out.print("Ingrese un índice entre 0 y 4: ");
            int indice = scanner.nextInt();
            System.out.println("Valor: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el índice está fuera de los límites del arreglo.");
        }

        scanner.close();
    }
}
