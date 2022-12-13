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
public class do_while_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
        bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
        Nota: recordar el uso de la sentencia break.
        */
        
        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int num;
        int sum = 0;
        
        do{
            System.out.println("Ingrese un número del 1 al 20. Intento "+(cont+1)+" de 20. Ingrese 0 para terminar antes");
            cont ++;
                    num = leer.nextInt();
                    if (num < 1 || num >20){
                        break;
                    }else{
                        sum = sum + num;
                    }
        } while (cont <20);
        System.out.println("Suma de los numeros ingresados: "+sum);
    }
    
}
