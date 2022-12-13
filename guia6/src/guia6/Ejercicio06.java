package guia6;
    import java.util.Scanner;
public class Ejercicio06 {

    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (num%2!=0){
            System.out.println("El número ingresado es impar");
        }else{
            System.out.println("El número ingresado es par");
        }
                
    }
    
}
