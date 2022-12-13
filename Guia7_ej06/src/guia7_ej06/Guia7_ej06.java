package guia7_ej06;

import java.util.Scanner;
import guia7_ej06.Nespresso;

public class Guia7_ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size;
        char opt = 0;

        Nespresso n1 = new Nespresso();

        System.out.println("Bienvenido");
        do {
            System.out.println("Ingrese que opción desea realizar.");
            System.out.println("A) Llenar la cafetera.");
            System.out.println("B) Servir una taza.");
            System.out.println("C) Vaciar la cafetera.");
            System.out.println("D) Agregar café.");
            System.out.println("E) Consultar cantidad de café restante.");
            System.out.println("F) Salir.");

            opt = scan.next().toLowerCase().charAt(0);

            switch (opt) {
                case 'a':
                    n1.fillCoffeM();
                    opt = 0;
                    break;
                case 'b':
                    System.out.println("Ingrese tamaño a servir.");
                    size = scan.nextInt();
                    n1.serveCup(size);
                    opt = 0;
                    break;
                case 'c':
                    n1.emptyKettle();
                    opt = 0;
                    break;
                case 'd':
                    System.out.println("Ingrese cantidad de café a añadir.");
                    size = scan.nextInt();
                    n1.addCoffe(size);
                    opt = 0;
                    break;
                case 'e':
                    System.out.print("Capacidad actual: ");
                    System.out.println(n1.getCurrentCap());
                    opt = 0;
                    break;
                case 'f':
                    System.out.println("Gracias por utilizar el servicio.");
                    opt = 1;
                    break;
                default:
                    System.out.println("Opcion no valida. intentelo nuevamente.");
                    opt=0;
                    break;
            }

        } while (opt == 0);

        //System.out.println("Ingrese tamaño a servir");
        //size = scan.nextInt();
    }

}
