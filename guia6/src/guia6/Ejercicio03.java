package guia6;
    import java.util.Scanner;
public class Ejercicio03 {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese una frase.");
           String s = leer.next();
           System.out.println("la frase en mayúscula es: ");
           System.out.println(s.toUpperCase());
           System.out.println("la frase en minúscula es: " );
           System.out.println(s.toLowerCase());
    }
    
}
