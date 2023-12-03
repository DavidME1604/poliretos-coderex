/*
   * @author Johann Vladimir Pasquel Montenegro
   * @Github Vladimirjon
   * version 1.0  
   *
   * @since 2023-12-01
   * 
   * @license
   * 
   * 1
     1	 1
     1	 2	  1
     1   3   3    1
     1   4   6    4    1
     1   5   10   10   5   1
   *   
*/
package Figuras;

public class Figura15EscaleraPascal {
   /**
    * La escalera esta basada en el triangulo de Pascal
    * @param tamanioFigura
    */
   public void Pascal(int tamanioFigura){
      for (int i = 0; i < tamanioFigura; i++) {
         int num = 1;
         for (int j = 0; j <= i; j++) {
             System.out.print(num + " ");
             num = num * (i - j) / (j + 1);
         }
         System.out.println();
     }
   }
}
