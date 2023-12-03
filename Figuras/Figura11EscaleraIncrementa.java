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
         * Imprime una escalera con bloques que incrementan en cada nivel.
         * 
         * @param tamanioFigura El tamaño de la escalera.
         */
        public void EscaleraIncrementa(int tamanioFigura) {
            // Recorremos cada nivel de la escalera
            for (int i = 0; i < tamanioFigura; i++) {
                // Imprimimos espacios antes de cada bloque en el nivel actual
                for (int j = 0; j < i; j++) {
                    System.out.print("           "); // Incremento en la cantidad de espacios
                }
    
                // Imprimimos el bloque en el nivel actual con guiones adicionales
                System.out.println("|" + " _ _".repeat(i + 1));
            }
        }
}
