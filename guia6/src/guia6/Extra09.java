package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra09 {

    /**
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo,
     * y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13: 50
     * – 13 = 37 una resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13
     * = 11 tres restas realizadas dado que 11 es menor que 13, entonces: el
     * residuo es 11 y el cociente es 3. ¿Aún no lo entendiste? Recomendamos
     * googlear división con restas sucesivas
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, n2, res, c = 0;

        do {
            System.out.println("Ingresa dos números mayores a 1");
            n = scan.nextInt();
            if (n < 1) {
                System.out.println("El número debe ser mayor a 1");
            }
            res = n;
            n2 = scan.nextInt();
            if (n2 < 1) {
                System.out.println("El número debe ser mayor a 1");
            }
        } while (n < 1 || n2 < 1);
        System.out.println("Números ingresados correctamente");
        for (int i = 0; i < 3; i++) {
            res = (res - n2);
            c++;
            System.out.println("Resta n " + (c) + " realizada");
        }
        if (n2 > res) {
            System.out.print("Dado que " + res + " es menor a " + n2);
            System.out.println(" el residuo es " + res + " y el cociente es " + c);
        } else {
            System.out.println("La division es demaciado larga para realizarse en 3 pasos.");
            System.out.println("El residuo es " + res + " y el cociente es " + c);
        }

    }

}
