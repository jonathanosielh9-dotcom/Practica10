package ejercicio2;

public class CTO extends Empleado {
    private double acciones;

    public CTO(String nom, double base, double acciones) {
        super(nom, base);
        this.acciones = acciones;
    }

    public double getAcciones() {
        return acciones;
    }

    @Override
    public double calcularSalario() {
        return getBase() + acciones;
    }
}
