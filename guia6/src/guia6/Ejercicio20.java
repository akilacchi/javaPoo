package guia6;

import java.util.Scanner;

public class Ejercicio20 {

    static Scanner scan = new Scanner(System.in);

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        int aux = 0, aux2 = 0, aux3 = 0, n = 0;
        boolean flag;
        System.out.println("Ingrese los datos de la matriz int[3][3]");

        if (n < 1 || n > 9) {
            flag = false;

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (num[i][j] < 1 || num[i][j] > 10) {
                    n = scan.nextInt();
                    if (n > 0 && n < 10) {
                        num[i][j] = n;
                    } else {
                        System.out.println("Número incorrecto");
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
            
            aux = (aux + num[i][j]);
            aux2 = (aux2 + num[j][i]);
            aux3 = (aux3 + num[i][i]);
            }
        }
        
        if (aux == aux2 && aux == aux3) {
            System.out.println("El cuadrado es mágico");

        } else {
            System.out.println("El cuadrado no es mágico");
        }

    }
}
