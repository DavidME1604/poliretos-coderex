package Figuras;
/**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * 0                                   0
            1                       1      
                  0	      0        
                        1                           
                  0           0
            1			    1

      0                                   0 
     */
public class Figura17NumerosX {
    /**
     * Crea el patron con 0 y 1 en X
     * @param tamanioFigura
     */
    public void NumerosX(int tamanioFigura) {
        int espacios = 0;
        for (int i = 1; i <= tamanioFigura*2+1; i++) {
            for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
                System.out.print((i!=tamanioFigura+1)?(((j == 1 + espacios || j == ((tamanioFigura +1) * 2) - espacios))
                        ? (((tamanioFigura % 2 == 0) ? ((i % 2 == 0) ? 0+" " : 1+" ") : ((i % 2 != 0) ? 0+" " : 1+" ")))
                        : "      "): (j==espacios)? "       "+1:"      ");
            }
            if(i<=tamanioFigura){
                espacios++;
            }else{
                espacios--;
            }
            System.out.println();
        }

        /* Version anterior
         * int espacios = 0;
        for (int i = 1; i <= tamanioFigura; i++) {
            for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
                System.out.print((j == 1 + espacios || j == ((tamanioFigura + 1) * 2) - espacios)
                        ? (((tamanioFigura % 2 == 0) ? ((i % 2 == 0) ? 0 : 1) : ((i % 2 != 0) ? 0 : 1)))
                        : "      ");
            }
            espacios++;
        }
        for (int i = 0; i <= espacios; i++) {
            System.out.print((i == espacios) ? 1 : "      ");
        }
        System.out.println();
        espacios--;
        for (int i = 1; i <= tamanioFigura; i++) {
            for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
                System.out.print((j == 1 + espacios || j == ((tamanioFigura + 1) * 2) - espacios)
                        ? ((i % 2 != 0) ? 0 : 1)
                        : "      ");
            }
            espacios--;
            System.out.println();
        }
         */
    }
}
