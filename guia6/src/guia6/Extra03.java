package guia6;

import java.util.Scanner;

/**
 *
 *
 * @author akila
 */
public class Extra03 {

    /**
     * * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si
     * se trata de una vocal. Caso contrario mostrar un mensaje. Nota:
     * investigar la función equals() de la clase String
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra");
        String a = leer.next();

        switch (a.toLowerCase().charAt(0)) {
            case 'a':
                System.out.println("la letra es una vocal");
                break;
            case 'e':
                System.out.println("la letra es una vocal");
                break;
            case 'i':
                System.out.println("la letra es una vocal");
                break;
            case 'o':
                System.out.println("la letra es una vocal");
                break;
            case 'u':
                System.out.println("la letra es una vocal");
                break;
            default:
                System.out.println("La letra es una consonante");
                break;
        }

    }

}
