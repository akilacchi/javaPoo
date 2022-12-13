package guia7_ej08;

import java.util.Scanner;
import guia7_ej08.Chain;

public class Guia7_ej08 {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in).useDelimiter("\n");
        String aux;
        char opt='0';
        Chain c = new Chain();
        
        System.out.println("Ingrese una frase");
        aux = scan.next();
        c.setC(aux);
        c.setLon(aux.length());
        
        do{
            System.out.println("Qué acción desea realizar? ");
            System.out.println("A) Enumerar cantidad de vocales en la frase.");
            System.out.println("B) Invertir la frase.");
            System.out.println("C) Buscar las veces que se repita una letra.");
            System.out.println("D) Comparar longitud de la frase original a la de una nueva frase.");
            System.out.println("E) Unir la frase original a una nueva frase.");
            System.out.println("F) Reemplazar las letras 'a' que se encuentren en la frase original por una nueva letra.");
            System.out.println("G) Buscar una letra dentro de la frase original.");
            System.out.println("H) Salir.");
            
            opt= scan.next().toLowerCase().charAt(0);
            
            switch(opt){
                case 'a':
                    c.showVowels();
                     System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'b':
                    System.out.println("La frase invertida es");
                    c.invertPhrase();
                     System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'c':
                    System.out.println("Ingrese letra a revisar.");
                    aux = scan.next();
                    c.timesRepeated(aux);
                    System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'd':
                    System.out.println("Ingrese nueva frase.");
                    aux = scan.next();
                    c.compareLength(aux);
                    System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'e':
                    System.out.println("Ingrese nueva frase.");
                    aux = scan.next();
                    c.joinPhrases(aux);
                    System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'f':
                    System.out.println("Ingrese la latra con la que desea reemplazar la frase original.");
                    aux = scan.next();
                    c.replace(aux);
                    System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'g':
                    System.out.println("Ingrese la letra a comparar");
                    aux = scan.next();
                    c.contains(aux);
                    System.out.println("Desea continuar operando? (s/n)");
                    aux = scan.next();
                    if(aux.charAt(0)=='s'){
                        opt='0';
                    }
                    break;
                case 'h':
                    System.out.println("Vuelva pronto.");
                    break;
            }
            
        }while (opt=='0');
        
    }

}
