package Nivel2.Ejercicio039;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.printf("Precio: Q%.2f%n", precio);
    }
}

public class Ejercicio039 {
    public static void main(String[] args) {
        Producto producto = new Producto("Mochila", 175.00);
        producto.mostrarProducto();
    }
}
