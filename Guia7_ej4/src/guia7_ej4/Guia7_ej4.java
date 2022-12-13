package guia7_ej4;

import guia7_ej4.Rectangle;

public class Guia7_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
       
       r1.createRectangle();
       
        System.out.println("Superficie del rectángulo:");
        System.out.println(r1.surface());
        System.out.println("Perimetro del rectángulo:");
        System.out.println(r1.perimeter());
        System.out.println("Rectámgulo dibujado con '*':");
        r1.drawRectangle();
    }
    
}
