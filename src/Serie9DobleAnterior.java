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
public class Serie9DobleAnterior {

    /**
     * Imprime los términos de la serie utilizando un bucle for y un incremento constante de 2.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosFor(int numeroElementos) {
        for (int contador = 0, valor = 2; contador < numeroElementos; valor *= 2, contador++) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Imprime los términos de la serie utilizando un bucle do-while y un incremento constante de 2.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosDoWhile(int numeroElementos) {
        int contador = 0, valor = 2;
        do {
            System.out.print(valor + " ");
            valor *= 2;
        } while (++contador < numeroElementos);
    }

    /**
     * Imprime los términos de la serie utilizando un bucle while y un incremento constante de 2.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirMultiplicacionPorDosWhile(int numeroElementos) {
        int contador = 0, valor = 2;
        while (contador++ < numeroElementos) {
            System.out.print(valor + " ");
            valor *= 2;
        }
    }
}
