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
public class While_statement {
      public static void main(String[] args){
          
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese la nota del alumno");
          
          int num = leer.nextInt();
          while (num <0 || num>10){
              System.out.println("Nota fuera de rango, Intentelo nuevamente");
              num =  leer.nextInt();
              
          }
          
      }
}
