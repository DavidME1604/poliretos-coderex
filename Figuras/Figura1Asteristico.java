package Figuras;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-21
     * 
     * @license
     * 
     *         
    F1:     * * * * *                                                       
            *       *
            *       *
            *       *
            * * * * *
     */

public class Figura1Asteristico {

    public void CuadroConAsteriscos(int tamanioFigura) {
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 0; j < tamanioFigura; j++) {
                boolean esBorde = i == 0 || i == tamanioFigura - 1 || j == 0 || j == tamanioFigura - 1;
                System.out.print(esBorde ? "* " : "  ");
            }
            System.out.println();
        }
    }


}
