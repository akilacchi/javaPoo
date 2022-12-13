package guia6;
    
import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra08 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n, c=0, cp=0,ci=0;
            
            do{
                System.out.println("Ingresa un número, para terminar, ingresa un numero multiplo de 5.");
                n = scan.nextInt();
                c++;
                if(n<0){
                    System.out.println("Los números negativos no se sumarán");
                    c--;
                    continue;
                }
                if(n%2==0){
                    cp++;
                }else{
                    ci++;
                }
            }while (n%5!= 0);
            
            System.out.println("Cantidad de números sumados "+c);
            System.out.println("Cantidad de números impares "+ci);
            System.out.println("Cantidad de numeros pares "+cp);
    }

}
