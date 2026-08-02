package Nivel2.Ejercicio037;

class Producto {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

public class Ejercicio037 {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setPrecio(49.99);
        System.out.printf("Precio encapsulado: Q%.2f%n", producto.getPrecio());
    }
}
