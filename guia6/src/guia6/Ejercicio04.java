package guia6;
    import java.util.Scanner;
public class Ejercicio04 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese temperatura en centigrados.");
        double tem = leer.nextInt();
        double f = 1.8;
        System.out.println("La temperatura en farenheit es: "+(tem*f+32));
    }
    
}
