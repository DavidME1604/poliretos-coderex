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
     *      * + * + *
            +       +
            *       *
            +       +
            * + * + *
     */
public class Figura2AteriscoMas {
    /**
     * Cuadrado con *+
     * @param tamanioFigura
     */
    public void AteriscoMasCuadradoFor(int tamanioFigura) {
        char caracter = '*';
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 0; j < tamanioFigura; j++) {
                System.out.print((i==0||i==tamanioFigura-1) ? caracter + " ":(j==0||j==tamanioFigura-1)? caracter+" ": "  ");
                if (caracter == '*') {
                    caracter = '+';
                } else {
                    caracter = '*';
                }
            }
            System.out.println();
        }
    }
}
