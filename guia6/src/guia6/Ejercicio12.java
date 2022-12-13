package guia6;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String s;
        char a = 'X', b = 'O';
        String fda = "&&&&&";
        boolean end = false;
        int contA = 0, contB = -1;

        do {
            System.out.println("Ingrese una cadena, para finalizar escriba '&&&&&'");
            s = leer.next();
            if (s.equals(fda)) {
                end = true;
            }

            if (s.charAt(0) == a && s.charAt(4) == b && s.length() == 5) {
                contA++;
                System.out.println("Cadena ingresada exitosamente.");
            } else {
                contB++;
                System.out.println("Cadena defectuosa o mal typeada.");
            }
        } while (end == false);

        System.out.println("Programa finalizo correctamente.");
        System.out.println("Cadenas ingresadas exitosamente: " + contA);
        System.out.println("Cadenas fallidas: " + contB);
    }

}
