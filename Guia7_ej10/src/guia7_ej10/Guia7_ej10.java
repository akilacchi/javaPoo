package guia7_ej10;

import java.util.Arrays;

public class Guia7_ej10 {

    public static void main(String[] args) {

        double[] mtxA = new double[50];
        double[] mtxB = new double[20];

        System.out.println("Arreglo A:");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            mtxA[i] = (Math.random() * 10);
            //mtxA[i] = (int) (Math.random() * 10);
            System.out.print("[" + mtxA[i] + "]");
        }
        System.out.println("");

        Arrays.sort(mtxA);

        System.out.println("Arreglo A en orden ascendente:");

        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print("[" + mtxA[i] + "]");
        }
        System.out.println("");

        System.out.println("Arreglo B");

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                mtxB[i] = mtxA[i];
            } else {
                mtxB[(i)] = 0.5;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print("[" + mtxB[i] + "]");
        }
        System.out.println("");
    }

}
