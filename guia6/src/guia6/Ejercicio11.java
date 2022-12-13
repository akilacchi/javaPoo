package guia6;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros positivos");
        int numA = leer.nextInt();
        int numB = leer.nextInt();
        int opc;
        double div = (double)(numA/numB);
        //String c = "";
        String con = "S";
        do {
            System.out.println("Ingrese el valor de la opcion a realizar.");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de ambos números es " + (numA + numB));
                    break;
                case 2:
                    System.out.println("La resta de ambos números es " + (numA - numB));
                    break;
                case 3:
                    System.out.println("La multiplicación de ambos números es " + (numA * numB));
                    break;
                case 4:
                    System.out.println("La división de ambos números es " + (div));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir? (S/N)");
                    String c = leer.next();
                    if (c.equals(con)) {
                        break;
                    } else {
                        opc = 0;
                    }
            }
        } while (opc!=5);
    }
}
