package Nivel2.Ejercicio050;

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " - " + puesto);
    }
}

public class Ejercicio050 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", "Gerente"));
        empleados.add(new Empleado("Luis", "Contador"));
        empleados.add(new Empleado("Marta", "Desarrolladora"));

        System.out.println("Empleados creados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarDatos();
        }
    }
}
