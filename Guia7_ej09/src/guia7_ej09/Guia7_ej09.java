package guia7_ej09;
import guia7_ej09.Matematica;

public class Guia7_ej09 {

    
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        double a,b;
        
        System.out.println("Generando números aleatoreos.");
        a= (Math.random()*10+1);
        b= (Math.random()*10+1);
            
        System.out.println("Seteando números aleatoreos.");
        m1.setA(a);
        m1.setB(b);
        
        System.out.println("El mayor de los números es: "+m1.returnGreater());
        
        System.out.println("La potencia del número mayor por la del menor es: "+m1.returnPower());
        
        System.out.println("La raíz del número menor es: "+m1.sRoot());
        
        System.out.println("El primer número es: "+m1.getA());
        System.out.println("El segundo número es: "+m1.getB());
        

    }
    
}
