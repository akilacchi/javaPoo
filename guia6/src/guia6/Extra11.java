package guia6;
import java.util.Scanner;
/**
 *
 * @author akila
 */
public class Extra11 {

    /**
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
     * matemáticamente utilizando el operador de división. Nota: recordar que
     * las variables de tipo entero truncan los números o resultados.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int n=scan.nextInt();
        int c=0;
        do{
            n = n/10;
            c++;
        }while(n!=0);
            System.out.println("Longitud del número ");
            System.out.println(c);
    }
}
