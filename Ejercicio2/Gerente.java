package ejercicio2;

public class Gerente extends Empleado {
    private double bonoGerencial;

    public Gerente(String nombre, double salarioBase, double bonoGerencial) {
        super(nombre, salarioBase);
        this.bonoGerencial = bonoGerencial;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoGerencial;
    }

    public void autorizarBono() {
        System.out.println("Bono gerencial autorizado para " + getNombre());
    }
}
