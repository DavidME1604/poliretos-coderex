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
     *      123456789
            12345678
            1234567
            123456
            12345
            1234
            123
            12
            1
     */
public class Figura12TrianguloInvertido {
    /**
     * Crea el triangulo de numeros invertidos
     * @param tamanioFigura
     */
    public void TrianguloInvertido(int tamanioFigura) {
        int maxNumero = tamanioFigura;
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 1; j <= maxNumero; j++) {
                System.out.print(j);
            }
            maxNumero--;
            System.out.println();
        }

    }
}
