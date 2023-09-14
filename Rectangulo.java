import java.lang.Math;
import java.util.Scanner;

public class Rectangulo {
    ///atrubutos
    private float base;
    private float altura;
    private float area;
     private float perimetro;
    Scanner scan;

    //constructore

    public Rectangulo(){
        scan= new Scanner(System.in);
    }

    ///metodos
    public void leerdatos(){
        System.out.println("base: ");
        base= scan.nextFloat(); 
        System.out.println("altura: ");
        altura= scan.nextFloat(); 
    }  
    public void cacularperimetro (){
        perimetro=(float)(2 * (base + altura));
    }  
    public void caculararea (){
        area=(float)(base * altura);
        
    }  



}
