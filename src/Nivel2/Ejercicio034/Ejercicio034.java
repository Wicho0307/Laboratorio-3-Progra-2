package Nivel2.Ejercicio034;

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        saldo = saldoInicial;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > saldo) {
            throw new IllegalArgumentException("El retiro es inválido o supera el saldo disponible.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Ejercicio034 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100.00);

        try {
            cuenta.retirar(150.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Operación rechazada: " + e.getMessage());
        }

        System.out.printf("El saldo permanece en: Q%.2f%n", cuenta.getSaldo());
    }
}
