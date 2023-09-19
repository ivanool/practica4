import java.lang.Math;
import java.util.Scanner;

public class Circulo {

    private double area;
    private double perimetro;
    private double radio;
    private Scanner sc = new Scanner(System.in);
    
    public void leerDatos(){
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        this.radio = radio;
    }

    public void calcularArea(){
        this.area = Math.PI * Math.pow(this.radio, 2);
    }
    
    public void calcularPerimetro(){
        this.perimetro = 2 * Math.PI * this.radio;
    }

    public double get_perimetro(){
        return this.perimetro;
    }
    
    public double get_area(){
        return this.area;
    }
    
    public double get_radio(){
        return this.radio;
    }
    
    public void listarDatos(){
        System.out.println("Radio del círculo: " + this.radio);
        System.out.println("Área del círculo: " + this.area);
        System.out.println("Perímetro del círculo: " + this.perimetro);
    }
    
}
