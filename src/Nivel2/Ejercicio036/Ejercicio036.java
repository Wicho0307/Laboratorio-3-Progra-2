package Nivel2.Ejercicio036;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Ejercicio036 {
    public static void main(String[] args) {
        Producto producto = new Producto("Cuaderno", 25.50);
        System.out.println("Producto creado: " + producto.nombre);
        System.out.println("Precio: Q" + producto.precio);
    }
}
