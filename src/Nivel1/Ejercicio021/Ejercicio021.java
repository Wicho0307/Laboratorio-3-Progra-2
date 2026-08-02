package Nivel1.Ejercicio021;

import java.util.Scanner;

public class Ejercicio021 {
    public static void validarEmail(String email) {
        int posicionArroba = email.indexOf('@');
        int posicionPunto = email.lastIndexOf('.');

        if (posicionArroba <= 0
                || posicionPunto <= posicionArroba + 1
                || posicionPunto == email.length() - 1) {
            throw new IllegalArgumentException("El correo electrónico no tiene un formato válido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un correo electrónico: ");
        String email = scanner.nextLine().trim();

        try {
            validarEmail(email);
            System.out.println("Correo electrónico válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
