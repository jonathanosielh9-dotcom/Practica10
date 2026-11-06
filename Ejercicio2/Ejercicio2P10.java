package ejercicio2;

public class Ejercicio2P10 {
    public static void main(String[] args) {
        Empleado[] lista = {
            new Gerente("Laura", 45000.0, 15000.0),
            new CTO("Carlos", 80000.0, 35000.0),
            new Ingeniero("David", 28000.0, 10, 250.0)
        };

        for (Empleado e : lista) {
            System.out.println("Empleado: " + e.getNom());
            System.out.println("Salario Base: " + e.getBase());

            if (e instanceof Gerente) {
                Gerente g = (Gerente) e;
                System.out.println("Bono: " + g.getBono());
            } else if (e instanceof CTO) {
                CTO c = (CTO) e;
                System.out.println("Bono de Acciones: " + c.getAcciones());
            } else if (e instanceof Ingeniero) {
                Ingeniero i = (Ingeniero) e;
                System.out.println("Horas Extras: " + i.getHe() + " (Pago por HE: " + i.getPagoHe() + ")");
            }

            System.out.println("Sueldo Total: " + e.calcularSalario() + "\n\n");
        }
    }
}
