package Nivel2.Ejercicio038;

class Producto {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        this.precio = precio;
    }
}

public class Ejercicio038 {
    public static void main(String[] args) {
        Producto producto = new Producto();

        try {
            producto.setPrecio(-10.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
