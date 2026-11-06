package ejercicio2;

public class Ingeniero extends Empleado {
    private int he;
    private double pagoHe;

    public Ingeniero(String nom, double base, int he, double pagoHe) {
        super(nom, base);
        this.he = he;
        this.pagoHe = pagoHe;
    }

    public int getHe() {
        return he;
    }

    public double getPagoHe() {
        return pagoHe;
    }

    @Override
    public double calcularSalario() {
        return getBase() + (he * pagoHe);
    }
}
