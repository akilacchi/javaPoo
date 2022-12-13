package guia6;
import java.util.Scanner;
public class funcion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String s;

        System.out.println("Escriba una frase.");
        s = leer.next();
        int num = s.length();
        System.out.println("La frase codificada es: ");
        String retorno = code(s, num);
        System.out.println(retorno);
    }
    public static String code(String s, int num) {
        String code = "";
        char temp;
        for (int i = 0; i < num; i++) {
            temp = s.charAt(i);
            switch (temp) {
                case 'a':
                    temp = '@';
                    break;
                case 'e':
                    temp = '#';
                    break;
                case 'i':
                    temp = '$';
                    break;
                case 'o':
                    temp = '%';
                    break;
                case 'u':
                    temp = '*';
                    break;
            }
            code = code + temp;
        }
        return code;
    }
}
