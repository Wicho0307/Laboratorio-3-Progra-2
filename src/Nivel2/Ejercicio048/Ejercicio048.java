package Nivel2.Ejercicio048;

class Empleado {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor que cero.");
        }
        this.salario = salario;
    }
}

public class Ejercicio048 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        try {
            empleado.setSalario(-1000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
