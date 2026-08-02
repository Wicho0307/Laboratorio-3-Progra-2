package Nivel2.Ejercicio047;

class Empleado {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Ejercicio047 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setSalario(7200.00);
        System.out.printf("Salario encapsulado: Q%.2f%n", empleado.getSalario());
    }
}
