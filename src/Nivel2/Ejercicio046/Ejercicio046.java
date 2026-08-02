package Nivel2.Ejercicio046;

class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
}

public class Ejercicio046 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("José", "Programador", 6500.00);
        System.out.println("Se creó correctamente un objeto Empleado.");
    }
}
