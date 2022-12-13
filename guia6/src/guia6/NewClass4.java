/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author akila
 */
public class NewClass4 {
    /*
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
    */
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         
         int cont = 0;
         int suma = 0;
         System.out.println("Ingrese un número");
         do {
         int num = leer.nextInt();
       
         cont ++;
           if (num <1 && num>-1){;
               System.out.println("se capturo el cero. Suma total "+ suma);
               break;
           }else if (num <0){
               System.out.println("los números negativos no se sumarán");
               continue;
           } else{
                suma = suma + num;
               continue;
         }
         } while (cont < 20);
         
               System.out.println("Conteo finalizado. Suma total " + suma);
         
     }
}
