/*
  *********
   *******
    *****
	 ***
	  *
 */

package Figuras;

public class Figura5Piramide {
    public void Piramideasterisco(int tamanioFigura){
        int contador = tamanioFigura;        
        for(int i=0;i<=tamanioFigura;i++){ 
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            } 
            for(int j=0;j<contador;j++){
                System.out.print("*");
            }
            contador-=2;
            System.out.println(" ");
        }
    }
}

