import java.util.Scanner;
import java.lang.Math;

public class Cuadrado {
    private double lado;
    private double area;
    private double perimetro;
    private Scanner sc;

    public Cuadrado() {
        sc = new Scanner(System.in);
    }

    public void leerDatos() {
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
    }

    public void calcularPerimetro() {
        perimetro = 4 * this.lado;
    }

    public void calcularArea() {
        area = Math.pow(lado, 2);
    }

    public void listarDatos() {
        System.out.println("Lado del cuadrado: " + lado);
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

}
