package guia6;
import java.util.Scanner;
/**
 *
 * @author akila
 */
public class Extra06 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas");
        int n = scan.nextInt();
        int alt,a=0,b=0,c=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese altura(cm) de la persona numero "+(i+1)+" de "+n);
            alt = scan.nextInt();
            if (alt<160){
                b=b+alt;
                a=a+alt;
                c++;
            }else{
                a=a+alt;
            }
            System.out.println("");
            
        }
        System.out.println("Promedio de altura general: "+(double)(a/n));
        if (c>0){
        System.out.println("Promedio de altura de por debajo de los 160 cm: "+ (double)(b/c));
        }else{
            System.out.println("No hay personas con estatura menor a 160 en la lista");
        }
    }

}
