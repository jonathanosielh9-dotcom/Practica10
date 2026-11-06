package ejercicio2;

public class Empleado {
    private String nom;
    private double base;

    public Empleado(String nom, double base) {
        this.nom = nom;
        this.base = base;
    }

    public String getNom() {
        return nom;
    }

    public double getBase() {
        return base;
    }

    public double calcularSalario() {
        return base;
    }
}
