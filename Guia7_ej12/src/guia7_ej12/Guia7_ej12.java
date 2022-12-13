package guia7_ej12;

import java.util.Scanner;

public class Guia7_ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Person c1 = new Person();
        
        c1.createPerson();
        
        c1.calculateAge();
        
        System.out.println("Ingrese edad a comparar.");
        int age = scan.nextInt();
        
        System.out.println(c1.minor(age));
        
        
        c1.showPerson();
    }
    
}
