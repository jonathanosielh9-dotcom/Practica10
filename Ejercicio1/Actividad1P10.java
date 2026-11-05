package ejercicio1;

public class Actividad1P10 {
    
    public static void imprimirArea(Poligono poligono) {
        System.out.println("El área calculada es: " + poligono.calcularArea());
    }

    public static void main(String[] args) {
        Poligono p1 = new Circulo(5.0);
        Poligono p2 = new Triangulo(4.0, 3.0);

        imprimirArea(p1);
        imprimirArea(p2);

        Poligono[] arreglo = {
            new Circulo(2.5),
            new Triangulo(10.0, 5.0),
            new Circulo(1.0)
        };

        for (Poligono p : arreglo) {
            if (p instanceof Circulo) {
                Circulo c = (Circulo) p;
                System.out.println("Círculo de radio " + c.getRadio() + " - Área: " + c.calcularArea());
            } else if (p instanceof Triangulo) {
                Triangulo t = (Triangulo) p;
                System.out.println("Triángulo de base " + t.getBase() + " y altura " + t.getAltura() + " - Área: " + t.calcularArea());
            }
        }
    }
    
}
