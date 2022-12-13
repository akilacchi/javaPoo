package guia6;
    import java.util.Scanner;

public class Ejercicio01 {

    
    public static void main(String[] args) {
        /*
        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
        dos. El programa deberá después mostrar el resultado de la suma
        */
        
        Scanner leer = new Scanner(System.in);
        int numA, numB;
        System.out.println("Ingrese dos números:");
        numA = leer.nextInt();
        numB = leer.nextInt();
        System.out.println("La suma de los números ingresados es: "+(numA+numB));
        
    }
    
}
