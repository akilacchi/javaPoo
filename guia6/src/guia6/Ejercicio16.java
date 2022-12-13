package guia6;

import java.util.Scanner;
import static java.lang.Math.random;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, b, cont = 0, aux = 0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = (int)(Math.random() * 10);
        }
        System.out.println("Ingrese numero a buscar dentro del vector");
        b = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] == b) {
                cont++;
                aux = i;
            }

        }
        if (cont == 0) {
            System.out.println("El número no se encontro en el vector");
        } else {
            System.out.println("El numero " + b + " se encontro en el vector en la posicion " + aux + " y se repitió " + cont + " veces");
        }
    }
}
