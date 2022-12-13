package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra10 {

    /**
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        int n,n2,aux;
        n = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        aux = (n*n2);
        System.out.println("pista: el número es un multiplo de 2 números aleatorios menores a 10");
        int t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        if (t < aux) {
            System.out.println("El número ingresado es menor a al número aleatoreo");
            System.out.println("Vuelve a intentarlo, ingresa otro número");
            t = scan.nextInt();
        }else if(t>aux){
            System.out.println("El número ingresado es mayor a al número aleatoreo");
            System.out.println("Vuelve a intentarlo, ingresa otro número");
            t = scan.nextInt();
        }
        if(t==aux){
            System.out.println("Felicidades, el número ingresado es correcto");
        }else{
            System.out.println("Lamentablemente el número es incorrecto");
            System.out.println("El número correcto era "+n);
        }
    }

}
