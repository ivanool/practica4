import java.util.Scanner;

public class Rectangulo{
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    private Scanner scan;

    public void Rectangulo() {
        scan = new Scanner(System.in);
    }

    public void imprimir_nombres(){
        System.out.println("Pérez Casas Gil Iván");
        System.out.println("Lara Villa Luis Fernando");
        System.out.println("Montes Rosales Cassandra");
        System.out.println("Hernandez Cruz Alex Uriel");
    }
    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        this.base = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        this.altura = sc.nextDouble();
    }

    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
    }

    public void calcularArea() {
        area = base * altura;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public void listarDatos() {
        System.out.println("Base del rectángulo: " + base);
        System.out.println("Altura del rectángulo: " + altura);
        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

}
