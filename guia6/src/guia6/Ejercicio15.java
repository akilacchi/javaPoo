package guia6;

import java.util.Scanner;

public class Ejercicio15 {

    Scanner leer = new Scanner(System.in);
    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
    muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i<100;i++){
            num[i]= i+1;
        }
        for (int i=0; i<100;i++){
            System.out.println(num[i]);
        }
    }

}
