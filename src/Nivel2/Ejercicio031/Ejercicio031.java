package Nivel2.Ejercicio031;

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Ejercicio031 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(500.00);
        System.out.printf("Cuenta creada con saldo: Q%.2f%n", cuenta.getSaldo());
    }
}
