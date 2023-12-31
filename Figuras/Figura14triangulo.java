package Figuras;


/**
 * Clase que genera la Figura14triangulo.
 * 
 * <p>
 * La Figura14triangulo consiste en imprimir los coeficientes del triángulo de Pascal.
 * </p>
 * F14:                                                                    4
                        1
                      1    1
                    1    2    1
                  1    3    3    1
               1    4    6    4    1
             1   5   10    10    5   1
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Figura14triangulo {

    /**
     * Genera la Figura14triangulo con el número de filas especificado.
     * 
     * @param numRows El número de filas de la Figura14triangulo.
     */
    public void generarFigura14triangulo(int tamanioFigura) {
        for (int i = 0; i < tamanioFigura; i++) {
            
            for (int j = 0; j < tamanioFigura - i - 1; j++) {
                System.out.print("  ");
            }

            
            int coeficiente = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", coeficiente);
                coeficiente = coeficiente * (i - k) / (k + 1);
            }

            System.out.println();
        }
    }

}
