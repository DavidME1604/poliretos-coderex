package Figuras;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-03
     * 
     * @license
     * 
     *         
    F6:                                                                     1
    	     *
    	    ***
    	   *****
    	  *******
    	 *********
     */


public class Figura6TrianguloLleno {
 /**
         * Imprime una pirámide invertida con asteriscos (*)
         * @param tamanioFigura
         */
    public void TrianguloLleno(int tamanioFigura) {

        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = tamanioFigura - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
