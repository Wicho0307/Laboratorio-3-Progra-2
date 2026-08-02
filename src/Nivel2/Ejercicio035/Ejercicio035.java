package Nivel2.Ejercicio035;

class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo disponible: Q%.2f%n", saldo);
    }
}

public class Ejercicio035 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(750.50);
        cuenta.mostrarSaldo();
    }
}
