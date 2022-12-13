package guia7_ej02;
//import java.util.Scanner;
import guia7_ej02.Circumference;

public class Guia7_ej02 {

    
    public static void main(String[] args) {
        
        //Scanner scan = new Scanner(System.in);
        Circumference c1 = new Circumference();
        
        c1.createCircumference();
        
        System.out.println("Área del círculo");
        System.out.println(c1.area());
        System.out.println("");
        System.out.println("Perimetro del círculo");
        System.out.println(c1.perimeter());
        
        
        

    }

    
    
}
