package guia6;

import java.util.Scanner;

public class Extra13 {

    /**
     * Crear un programa que dibuje una escalera de números, donde cada línea de
     * números comience en uno y termine en el número de la línea. Solicitar la
     * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
     * número 3: 1 12 123
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para la escalera");
        int n = scan.nextInt();
        int c=1;
        String aux="";
        for (int i = 0; i < n; i++) {
            aux=aux+String.valueOf(c);
            System.out.println(aux);
            c++;
        }
    }

}
