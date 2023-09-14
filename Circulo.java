import java.lang.Math;
import java.util.Scanner;

public class Circulo{

    private float area;
    private float perimetro;
    private float radio;
    private Scanner sc = new Scanner(System.in);
    
    public void leer_datos(){
        System.out.println("Ingrese el radio del circulo: ");
        float radio = sc.nextFloat();
        this.radio = radio;
        return;
    }

    public void calcular_area(){
        return;
    }
    public void calcular_perimetro(){
        
        double pi = Math.PI;
        return;
    }

    public float get_perimetro(){
        return this.perimetro;
    }
    public float get_area(){
        return this.perimetro;
    }
    public float radio(){
        return this.perimetro;
    }
    
    public void listar_datos(){

    }
}