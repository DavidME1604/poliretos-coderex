/*
   1
   1	 1
   1	 2	  1
   1   3   3    1
   1   4   6    4    1
   1   5   10   10   5   1
 */

package Figuras;

public class Figura15EscaleraPascal {
   public void Pascal(int tamanioFigura){
      for (int i=0; i<tamanioFigura;i++) {
         int num=1;
         for(int k=0;k<tamanioFigura-i;k++){
            System.out.print("   ");
         }
         for(int j = 0; j <= i; j++){
            System.out.print(num + "   ");
            num=num*(i - j)/(j + 1);
         }
         System.out.println();
      }
   }
}
