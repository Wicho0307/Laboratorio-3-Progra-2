package Nivel1.Ejercicio014;

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio014 {
    public static void main(String[] args) {
        System.out.println("Se creó la excepción personalizada MiExcepcion.");
    }
}
