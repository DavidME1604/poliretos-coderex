/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    *   *********
         *******
          *****
	       ***
	        *
*/

package Figuras;

public class Figura5Piramide {
    /**
     * Piramide invertida con (*)
     * @param tamanioFigura
     */
    public void Piramideasterisco(int tamanioFigura){
        for (int i = tamanioFigura - 1; i >= 0; i--) {
            for (int j = 0; j < tamanioFigura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
    
            System.out.println();
        }
    }
}

