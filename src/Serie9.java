/**
 * Clase que representa la generación de la serie Serie9.
 * 
 * <p>
 * La serie Serie9 sigue un patrón de multiplicación por 2 y comienza con el número 2. 
 * Cada término de la serie se obtiene multiplicando por 2 al término anterior. Por lo tanto, 
 * la serie se forma como sigue: 2, 4, 8, 16, 32, 64, 128, 256, ..
 * </p>
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 23 de noviembre de 2023
 */
public class Serie9 {

    /**
     * Imprime los términos de la serie utilizando un bucle for y un incremento constante de 2.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosFor(int nPosiciones) {
        for (int contador = 0, valor = 2; contador < nPosiciones; valor *= 2, contador++) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Imprime los términos de la serie utilizando un bucle do-while y un incremento constante de 2.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosDoWhile(int nPosiciones) {
        int contador = 0, valor = 2;
        do {
            System.out.print(valor + " ");
            valor *= 2;
        } while (++contador < nPosiciones);
    }

    /**
     * Imprime los términos de la serie utilizando un bucle while y un incremento constante de 2.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosWhile(int nPosiciones) {
        int contador = 0, valor = 2;
        while (contador++ < nPosiciones) {
            System.out.print(valor + " ");
            valor *= 2;
        }
    }
}
