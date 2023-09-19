import java.util.Scanner;

public class Robot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Cuadrado");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            Rectangulo rectangulo = new Rectangulo();
            switch (opcion) {
                case 1:
                    rectangulo.imprimir_nombres();
                    Triangulo triangulo = new Triangulo();
                    triangulo.leerDatos();
                    triangulo.calcularPerimetro();
                    triangulo.calcularArea();
                    triangulo.listarDatos();
                    break;
                case 2:
                    rectangulo.imprimir_nombres();
                    rectangulo.leerDatos();
                    rectangulo.calcularPerimetro();
                    rectangulo.calcularArea();
                    rectangulo.listarDatos();
                    break;
                case 3:
                    rectangulo.imprimir_nombres();
                    Circulo circulo = new Circulo();
                    circulo.leerDatos();
                    circulo.calcularArea();
                    circulo.listarDatos();
                    break;
                case 4:
                    rectangulo.imprimir_nombres();
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.leerDatos();
                    cuadrado.calcularArea();
                    cuadrado.calcularPerimetro();
                    cuadrado.listarDatos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    

}
