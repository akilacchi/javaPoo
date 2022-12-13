package ej_5_servicio;

import java.io.IOException;
import java.util.Scanner;

public class Ej_5_servicio {

    static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuentaServicio cs = new cuentaServicio();
        System.out.println("Bienvenido");
        System.out.println("Ingrese sus datos.");
        cs.crearCuenta();
        double aux;
        int opc;
        do {
            System.out.println("Que operacion desea realizar?");
            System.out.println("1. Ingresar dinero.");
            System.out.println("2. Retirar dinero.");
            System.out.println("3. Extracción rápida.");
            System.out.println("4. Consultar saldo.");
            System.out.println("5. Consultar datos.");
            System.out.println("6. Salir.");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escriba cantidad de dinero a ingresar");
                    aux = scan.nextDouble();
                    cs.ingresar(aux);
                    opc = 0;
                    break;
                case 2:
                    System.out.println("Escriba cantidad de dinero a retirar");
                    aux = scan.nextDouble();
                    cs.retirar(aux);
                    opc = 0;
                    break;
                case 3:
                    cs.extraccionRapida();
                    opc = 0;
                    break;
                case 4:
                    cs.consultarSaldo();
                    opc = 0;
                    break;
                case 5:
                    cs.consultarDatos();
                    opc = 0;
                    break;
                case 6:
                    System.out.println("Gracias por preferir nuestros servicios.");
                    opc = -1;
                    break;
                default:
                    System.out.println("Opción incorrecta, intentelo nuevamente");
                    opc = 0;
            }

        } while (opc == 0);
    }

   
}
