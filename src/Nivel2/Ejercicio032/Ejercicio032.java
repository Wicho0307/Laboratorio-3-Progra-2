package Nivel2.Ejercicio032;

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El depósito debe ser mayor que cero.");
        }
        saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Ejercicio032 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100.00);
        cuenta.depositar(50.00);
        System.out.printf("Saldo después del depósito: Q%.2f%n", cuenta.getSaldo());
    }
}
