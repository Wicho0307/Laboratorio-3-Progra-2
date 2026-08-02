package Nivel3.Integracion.Ejercicio070;

interface Vehiculo {
    void arrancar();

    void detener();
}

class Moto implements Vehiculo {
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    @Override
    public void arrancar() {
        System.out.println("La moto " + marca + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("La moto " + marca + " se ha detenido.");
    }
}

public class Ejercicio070 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Moto("Honda");
        vehiculo.arrancar();
        vehiculo.detener();
    }
}
