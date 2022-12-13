package guia6;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        String[] equipo = new String[5];      // martin, dani, isidro, maria martina
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            equipo[i] = leer.next();
        }
        for (int i = 0; i < 5; i++){
            System.out.print(" [" + equipo[i] + "] ");
        }
        System.out.println("");
    }

}
