package guia6;

import java.util.Scanner;

public class Ejercicio17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño para matriz");
        int n = leer.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100000 + 1);
        }

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        for (int i = 0; i < num.length; i++) {
            switch (String.valueOf(num[i]).length()) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
            }
        }
        System.out.println("cantidad de numeros con 1 digitos en la matriz: " + c1);
        System.out.println("cantidad de numeros con 2 digitos en la matriz: " + c2);
        System.out.println("cantidad de numeros con 3 digitos en la matriz: " + c3);
        System.out.println("cantidad de numeros con 4 digitos en la matriz: " + c4);
        System.out.println("cantidad de numeros con 5 digitos en la matriz: " + c5);
    }

}
