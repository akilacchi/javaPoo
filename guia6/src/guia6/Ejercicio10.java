package guia6;
    import java.util.Scanner;
public class Ejercicio10 {
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int max = leer.nextInt();
        int suma = 0;
        int num, con = 0;
        do{
            System.out.println("Ingrese un numero a sumar");
            num = leer.nextInt();
            suma = suma+num;
            con ++;
        }while (suma<max);
            System.out.println("Suma concluida, valor de la suma: "+suma+", en un total de "+con+" turnos");
    }
    
}
