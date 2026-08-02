package Nivel2.Ejercicio033;

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El retiro debe ser mayor que cero.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Ejercicio033 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(200.00);

        try {
            cuenta.retirar(80.00);
            System.out.printf("Retiro exitoso. Saldo: Q%.2f%n", cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
