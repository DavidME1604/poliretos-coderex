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
     *       ___
                |___
                    |___
                        |___
                            |___

     */
public class Figura7EscalerasIzq {
    /**
     * Crea las escaleras 
     * @param tamanioFigura
     */
    public void EscalerasIzqFor(int tamanioFigura){
        for (int i = 0; i <= tamanioFigura; i++) {
            System.out.println((i==0)?"___":"|___");
                for (int j = 0; j < i+1; j++) {
                    System.out.print((j==0)?"   ":"    ");
                }
        }
    }
}
