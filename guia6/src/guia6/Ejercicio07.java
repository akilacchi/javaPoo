package guia6;
import java.util.Scanner;
public class Ejercicio07 {
    /*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
    la función equals() en Java
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String pass = "eureka";
        String s = leer.next();
        if (s.equals(pass)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
