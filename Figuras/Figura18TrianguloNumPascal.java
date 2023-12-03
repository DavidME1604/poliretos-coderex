package Figuras;

public class Figura18TrianguloNumPascal {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear la siguiente figura:
     *  2
     *   1   2
     *   1   3   2
     *   1   4   5   2
     *   1   5   9   7  2
     *   1   6   14  16  9  2
     *   ....
     */
    public  void TrianguloNumPascal(int tamanioFigura) {
        int niveles = tamanioFigura;
        ImprimirPiramide(generarTriangulo(niveles));
    }

    public static int[][] generarTriangulo(int n) {
        int[][] triangulo = new int[n][];

        for (int i = 0; i < n; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 2;

            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }

        return triangulo;
    }

    public static void ImprimirPiramide(int[][] Piramide) {
        for (int[] fila : Piramide) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
