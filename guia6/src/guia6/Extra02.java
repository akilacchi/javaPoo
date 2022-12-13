package guia6;

/**
 *
 * @author akila
 */
public class Extra02 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10), b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10), d = (int) (Math.random() * 10);
        int aux = a;
        System.out.println("valores aleatoreos procesados");
        System.out.println("A=" + a + ", B=" + b + ", C=" + c + ", D=" + d);
        System.out.println("Modificando valores");
        a = d;
        d = b;
        b = c;
        c = aux;
        System.out.println("Valores modificados");
        System.out.println("A=" + a + ", B=" + b + ", C=" + c + ", D=" + d);

    }

}
