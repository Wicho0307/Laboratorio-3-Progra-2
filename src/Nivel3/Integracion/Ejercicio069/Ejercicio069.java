package Nivel3.Integracion.Ejercicio069;

interface Vehiculo {
    void arrancar();

    void detener();
}

class Carro implements Vehiculo {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public void arrancar() {
        System.out.println("El carro " + marca + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El carro " + marca + " se ha detenido.");
    }
}

public class Ejercicio069 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Carro("Toyota");
        vehiculo.arrancar();
        vehiculo.detener();
    }
}
