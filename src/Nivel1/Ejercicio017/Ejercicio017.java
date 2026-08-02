package Nivel1.Ejercicio017;

import java.util.Scanner;

public class Ejercicio017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese la posición del carácter: ");
        int posicion = scanner.nextInt();

        try {
            char caracter = texto.charAt(posicion);
            System.out.println("Carácter encontrado: " + caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: la posición no existe dentro del texto.");
        }

        scanner.close();
    }
}
