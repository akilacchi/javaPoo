package guia7_ej03;

import guia7_ej03.Operation;

public class Guia7_ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Operation o1 = new Operation();
        o1.createOperation();
        System.out.println("La suma de ambos números es:");
        System.out.println(o1.sum());
        System.out.println("La resta de ambos números es:");
        System.out.println(o1.subtract());
        System.out.println("La multiplicación de ambos números es:");
        System.out.println(o1.multiply());
        System.out.println("La división de ambos números es:");
        System.out.println(o1.division());
        
    }
    
}
