package Nivel1.Ejercicio010;

import java.util.Scanner;

public class Ejercicio010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese una contraseña de al menos 8 caracteres: ");
            String contrasena = scanner.nextLine();

            if (contrasena.length() < 8) {
                throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
            }

            System.out.println("Contraseña válida.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
