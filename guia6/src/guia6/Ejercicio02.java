package guia6;
    import java.util.Scanner;

public class Ejercicio02 {
    /*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
    pantalla.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String name;
        System.out.println("Ingrese su nombre");
        name = leer.next();
        System.out.println("Gracias por ingresar tu nombre, "+ name);
    }
    
}
