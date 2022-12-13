package guia6;

public class Extra12 {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0- 0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 0-1-2 0-1-E Nota: investigar función equals() y como convertir
     * números a String.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Contador");
        int cont = 0;
        String a, b, c, aux = "3";
        for (int i = 0; i < 1000; i++) {
            a = String.valueOf((cont / 100));
            b = String.valueOf((cont / 10 % 10));
            c = String.valueOf((cont % 10));
            cont++;
            if (c.equals(aux) && b.equals(aux) && a.equals(aux)) {
                a = "E";
                b = "E";
                c = "E";
            } else if (c.equals(aux) && b.equals(aux)) {
                b = "E";
                c = "E";
            } else if (b.equals(aux) && a.equals(aux)) {
                a = "E";
                b = "E";
            }else if (a.equals(aux)) {
                a = "E";
            } else if (b.equals(aux)) {
                b = "E";
            } else if (c.equals(aux)) {
                c = "E";
            }

            System.out.println(a + "-" + b + "-" + c);

        }
    }
}
