package guia6;

import java.util.Scanner;

public class Ejercicio14 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros 
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a convertir");
        int num = leer.nextInt();
        double retorno = convert(num);
        System.out.print("el valor convertido se traduce a: ");
        System.out.println(retorno);
       

    }

    public static double convert(int num) {
        Scanner leer = new Scanner(System.in);
        String s;
        double lib, dol, yen, ret = 0.0;
        boolean flag;
        
         do {
            System.out.println("Ingrese a que tipo de moneda quiere convertir");
            System.out.println("libras, dolares o yenes?");
            s = leer.next();
            switch (s.toLowerCase()) {
                case "libras":
                    lib = (num*0.88);
                    flag = true;
                    ret = lib;
                    break;
                case "dolares":
                    dol = (num*1.28611);
                    flag = true;
                    ret = dol;
                    break;
                case "yenes":
                    yen= (num*128.852);
                    flag = true;
                    ret = yen;
                    break;
                default:
                    flag = false;
            }
        } while (flag == false);
         return ret;
    }
}
