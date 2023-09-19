import java.util.Scanner;

public class Triangulo {
    private double base;
    private double altura;
    private double area;
    private double lado1;
    private double lado2;
    private double lado3;
    private double perimetro;
    private Scanner scan;

    public Triangulo() {
        scan = new Scanner(System.in);
    }

    public void leerDatos() {
        System.out.println("Ingrese la longitud del primer lado del triángulo: ");
        this.lado1 = scan.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
        this.lado2 = scan.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
        this.lado3 = scan.nextDouble();

    }

    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        this.perimetro = perimetro;
    }

    public void calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        this.area = area;    
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public void listarDatos() {
        System.out.println("Lados del triángulo: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área del triángulo: " + this.area);
        System.out.println("Perímetro del triángulo: " + this.perimetro);
    }
}
