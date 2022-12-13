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
public class if_statement {
    public static void main(String[] args) { 
        boolean bandera;
        int numA, numB;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        numA= leer.nextInt();
        numB= leer.nextInt();
        
        if (numA > 25 || numB>25){
            bandera = true;
        }else{
            bandera = false;
            
        }
            
        System.out.println("Alguno de los números indicados es mayor a 25? "+ bandera);
    }
}