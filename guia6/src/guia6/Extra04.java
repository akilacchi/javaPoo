package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra04 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
     * muestre su equivalente en romano
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, aux = 0;
        String s;
        System.out.println("Ingrese un numero entre uno y diez");

        do {
            n = scan.nextInt();
        } while (n < 0 && n > 10);

        switch (n) {
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                if (n < 4) {
                    for (int i = 0; i < n; i++) {
                        System.out.print("I");
                    }
                } else {
                    System.out.print("V");
                    for (int i = 0; i < (n - 5); i++) {
                        System.out.print("I");
                    }
                }
                break;
        }
        System.out.println("");
    }
}

