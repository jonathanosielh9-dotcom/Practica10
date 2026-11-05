package ejercicio2;

public class Ingeniero extends Empleado {
    private int horasExtras;
    private double pagoPorHoraExtra;

    public Ingeniero(String nombre, double salarioBase, int horasExtras, double pagoPorHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * pagoPorHoraExtra);
    }

    public void desplegarCodigo() {
        System.out.println("El ingeniero " + getNombre() + " esta desplegando codigo a produccion.");
    }
}
