package Nivel2.Ejercicio049;

class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.printf("Salario: Q%.2f%n", salario);
    }
}

public class Ejercicio049 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Elena", "Analista", 8000.00);
        empleado.mostrarDatos();
    }
}
