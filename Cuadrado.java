import java.lang.Math;
import java.util.Scanner;

public class Cuadrado{
    private float lado;
    private float area;
    private float perimetro;
    Scanner sc;

    public Cuadrado(){
        sc = new Scanner(System.in);
    }

    public void LeerDatos(){
        System.out.println( " Ingrese el valor del lado: " );
        lado=sc.nextFloat();
    }

    public void CalcularPerimetro(){
        perimetro= (float)(lado * 4);
    }

    public void CalcularArea(){
        area= (float)(lado * lado);
    }



    public float get_perimetro(){
        return this.perimetro;
    }
    public float get_area(){
        return this.area;
    }
    public void listar_datos(){

    }
}