package Nivel1.Ejercicio003;

import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto para convertirlo a número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        }

        scanner.close();
    }
}
