package guia6;

import java.util.Scanner;

public class Ejercicio19 {

    /**
     * Realice un programa que compruebe si una matriz dada es anti simétrica.
     * Se dice que una matriz A es anti simétrica cuando ésta es igual a su
     * propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica
     * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
     * obtiene cambiando sus filas por columnas (o viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] num = new int[3][3];
        int[][] aux = new int[3][3];
        int c = 0;
        System.out.println("Ingrese datos para matriz [3][3]");

        for (int i = 0; i < 3; i++) {                       //scanner
            for (int j = 0; j < 3; j++) {
                num[i][j] = scan.nextInt();
                aux[j][i] = num[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {                       //comparador
            for (int j = 0; j < 3; j++) {
                if ((num[i][j] * -1) == (aux[i][j])) {
                    c++;
                }
                System.out.print("[" + num[i][j] + "]");   //print num 
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {               
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + aux[i][j] + "]");    //print aux
            }
            System.out.println("");
        }

        System.out.println("");

        if (c == String.valueOf(num).length()) {            //final check
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

}
