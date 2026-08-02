package Nivel2.Ejercicio040;

import java.util.ArrayList;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.printf("%s - Q%.2f%n", nombre, precio);
    }
}

public class Ejercicio040 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Mouse", 2.50));
        productos.add(new Producto("Sistema Operativo", 25.00));
        productos.add(new Producto("Monitor", 5.75));

        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
}
