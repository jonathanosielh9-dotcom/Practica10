package ejercicio2;

public class CTO extends Empleado {
    private double bonoOpcionesAcciones;

    public CTO(String nombre, double salarioBase, double bonoOpcionesAcciones) {
        super(nombre, salarioBase);
        this.bonoOpcionesAcciones = bonoOpcionesAcciones;
    }

    public double getBonoOpcionesAcciones() {
        return bonoOpcionesAcciones;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoOpcionesAcciones;
    }

    public void revisarArquitectura() {
        System.out.println("El CTO " + getNombre() + " esta revisando la arquitectura del sistema.");
    }
}
