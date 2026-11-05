package ejercicio2;

public class Ejercicio2P10 {
    public static double calcularNóminaTotal(Empleado[] empleados) {
        double total = 0.0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

    public static void main(String[] args) {
        Empleado e1 = new Gerente("Laura", 45000.0, 15000.0);
        Empleado e2 = new CTO("Carlos", 80000.0, 35000.0);
        Empleado e3 = new Ingeniero("David", 28000.0, 10, 250.0);

        System.out.println(e1.getNombre() + " - Salario: " + e1.calcularSalario());
        System.out.println(e2.getNombre() + " - Salario: " + e2.calcularSalario());
        System.out.println(e3.getNombre() + " - Salario: " + e3.calcularSalario());

        Empleado[] plantilla = {
            new Gerente("Ana", 40000.0, 10000.0),
            new CTO("Roberto", 75000.0, 30000.0),
            new Ingeniero("Sofia", 25000.0, 15, 200.0)
        };

        System.out.println("Nomina total: " + calcularNóminaTotal(plantilla));

        for (Empleado emp : plantilla) {
            if (emp instanceof Gerente) {
                Gerente g = (Gerente) emp;
                g.autorizarBono();
            } else if (emp instanceof CTO) {
                CTO c = (CTO) emp;
                c.revisarArquitectura();
            } else if (emp instanceof Ingeniero) {
                Ingeniero ing = (Ingeniero) emp;
                ing.desplegarCodigo();
            }
        }
    }
}
