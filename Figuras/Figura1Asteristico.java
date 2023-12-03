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
    /**
     * Cuadrado con (*)
     * @param tamanioFigura
     */

     public void CuadroConAsteriscos(int tamanioFigura) {
        
        for (int filaOne = 0 ; filaOne < tamanioFigura ; filaOne++){
            System.out.print("* ");
        } 

        System.out.println();

        for (int columnas = 2 ; columnas < tamanioFigura ; columnas++){
            System.out.print("*");

            for ( int esp = 2 ; esp < tamanioFigura ; esp++){
                System.out.print("  ");
            }
            System.out.println(" *");   
        }
        
        for (int filaTwo = 0; filaTwo < tamanioFigura; filaTwo++){ 
            System.out.print("* ");
        }

    }

}
