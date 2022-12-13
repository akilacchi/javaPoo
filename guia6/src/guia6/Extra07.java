package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra07 {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0,n, max = 0, min=1_000_000, c = 0, tot = 0, aux;
        double prom;
        
        System.out.println("Ingrese cantidad de numeros");
        n = scan.nextInt();
        System.out.println("Que bucle usar?");
        System.out.println("1) while");
        System.out.println("2) do-while");

       while (a==0){
            a = scan.nextInt();
            if (a>2){
                a=0;
            }
        }

        if (a == 1) {
            while (c < n) {
                System.out.println("Ingrese numero "+(c+1));
               
                    aux = scan.nextInt();
                    tot = tot + aux;
                    c++;
                    if (min > aux) {
                        min = aux;
                    }
                    if (max < aux) {
                        max = aux;
                    
                }
            }
        } else {
            do {
                System.out.println("Ingrese numero "+(c+1));
                
                    aux = scan.nextInt();
                    tot = tot + aux;
                    c++;
                    if (min > aux) {
                        min = aux;
                    }
                    if (max < aux) {
                        max = aux;
                    }
                
            } while (c <n);
        }
        System.out.println("valor máximo: "+max);
        System.out.println("valor mínimo: "+min);
        prom = (double)(tot / n);
        System.out.println("valor promedio: "+prom);
    }

}
