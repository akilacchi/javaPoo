
package guia6;
import java.util.Scanner;

public class procedimiento {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numA, numB;
        
        System.out.println("Ingrese dos números");
        numA = leer.nextInt();
        numB = leer.nextInt();
        
    }
    
    public static void EsMultiplo (int numA, int numB){
        if (numA%numB != 0){
            System.out.println("El número "+numA+" no es divisible por "+numB);
        }else{
            System.out.println("El número "+numA+" es divisible por "+numB);
        }
    }
}
