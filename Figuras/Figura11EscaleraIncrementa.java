package Figuras;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *         
    F11:                                                                   1
            | _
               | _ _
                    | _ _ _
                           | _ _ _ _
                                    | _ _ _ _ _
     */

public class Figura11EscaleraIncrementa {

        /**
         * Imprime una escalera con bloques que incrementan en cada nivel(máxmo 5).
         * 
         * @param tamanioFigura El tamaño de la escalera.
         */
        
    public void EscaleraIncrementa(int tamanioFigura) {
        
            for (int i = 0; i < tamanioFigura; i++) {
                System.out.println("|" + " _".repeat(i + 1));
    

                for (int j = 0; j <= i; j++) {
                    System.out.print("   ".repeat(j+1));
                }
    
            }
    }        
}

        
