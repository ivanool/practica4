package Robot;
import java.util.Scanner;

public class Triangulo{
    //Atributos
    Scanner sc;
    private float base;
    private float altura;
    private float a;
    private float b;
    private float c;
    private float area;
    private float perimetro;


    //Constructores
    Public Triangulo(){
        sc = new Scanner(System.in);
    }

    //Metodos
    public void Datos(){
        System.out.println("Lado a");
        a = sc.nextFloat();
         System.out.println("Lado b");
        b = sc.nextFloat();
         System.out.println("Lado c");
        c = sc.nextFloat();

        System.out.println("Base");
        base = sc.nextFloat();
        System.out.println("Altura");
        altura = sc.nextFloat();
    }

    public void Perimetro(){
        perimetro = (float)a + b + c;
    }

    public void Area(){
        area = (float)(base * altura)/2;
    }

    public void (){
        System.out.println("Area: " + area);
        System.out.println("Perimetro:  " + perimetro);
    }
}



