package guia7_ej05;

import guia7_ej05.Account;
import java.util.Scanner;

public class Guia7_ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Account a1 = new Account();
        a1.createAccount();
        
        char aux;
        
        do{
            System.out.println("Qué operación desea realizar?");
            System.out.println("A) Ingresar dinero");
            System.out.println("B) Retirar dinero");
            System.out.println("C) Retiro rápido (20%)");
            System.out.println("D) Consultar saldo");
            System.out.println("E) Consultar datos");
            System.out.println("F) Salir");
            aux = scan.next().toLowerCase().charAt(0);
            switch (aux){
                case 'a':
                    System.out.println("Ingrese monto a depositar.");
                    a1.deposit(scan.nextDouble());
                    aux = 0;
                    break;
                case 'b':
                    System.out.println("Ingrese monto a retirar");
                    a1.withdraw(scan.nextDouble());
                    aux = 0;
                    break;
                case 'c':
                    a1.fastDraw();
                    aux = 0;
                    break;
                case 'd':
                    a1.balanceCheck();
                    aux = 0;
                    break;
                case 'e':
                    a1.datacheck();
                    aux = 0;
                    break;
                case 'f':
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida, intentelo nuevamente.");
                    aux = 0;
                    break;
            }
        }while (aux ==0);
    }
}
