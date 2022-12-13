package guia6;

/**
 *
 */
public class Ejercicio18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        int[][] mtx = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10 + 1);
                mtx[j][i] = num[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + num[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mtx[i][j] + "] ");
            }
            System.out.println("");
        }

    }

}
