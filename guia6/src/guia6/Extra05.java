package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class Extra05 {

    /**
     * Una obra social tiene tres clases de socios: o Los socios tipo ‘A’ abonan
     * una cuota mayor, pero tienen un 50% de descuento en todos los tipos de
     * tratamientos. o Los socios tipo ‘B’ abonan una cuota moderada y tienen un
     * 35% de descuento para los mismos tratamientos que los socios del tipo A.
     * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos. o Solicite una letra (carácter) que representa
     * la clase de un socio, y luego un valor real que represente el costo del
     * tratamiento (previo al descuento) y determine el importe en efectivo a
     * pagar por dicho socio.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = 100_000;
        System.out.println("Valor del tratamiento: " + v);
        System.out.println("Ingrese tipo de abono");
        char c = scan.next().toLowerCase().charAt(0);
        double d = -1;

        switch (c) {
            case 'a':
                d = 0.5;
                break;
            case 'b':
                d = 0.35;
                break;
            case 'c':
                d = 0;
                break;
            default:
                System.out.println("Tipo de abono no válido");
                break;
        }
        double dis = (v * d);
        
        if (d < 0) {
            System.out.println("Error.");
        } else {
            System.out.println("Su descuento en base a su tipo de abono equivale a " + d + "%");
            System.out.println("El nuevo valor del tratamiento es de " + (int) (v - dis));
        }

    }

}
