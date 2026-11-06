package ejercicio2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nom, double base, double bono) {
        super(nom, base);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSalario() {
        return getBase() + bono;
    }
}
