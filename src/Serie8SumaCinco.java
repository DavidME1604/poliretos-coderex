/**
 * Clase que representa la generación de la serie Ocho.
 * 
 * <p>
 * La serie S8 sigue un patrón de aumento constante de 5 y comienza con el número 3. 
 * Cada término de la serie se obtiene sumando 5 al término anterior. Por lo tanto, 
 * la serie se forma como sigue: 3, 8, 13, 18, 23, 28, 33, 38, ..
 * </p>
 * 
 * @author Lorena Lopez
 * @version 1.0
 * @since 20 de noviembre de 2023
 * @Github: lorent777
 */
public class Serie8SumaCinco {
    
    /**
     * Imprime los términos de la serie utilizando un bucle for y un incremento constante de 5.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirIncrementoEnCincoFor(int nPosiciones) {
        for (int contador = 0, valor = 3; contador < nPosiciones; valor += 5, contador++) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Imprime los términos de la serie utilizando un bucle do-while y un incremento constante de 5.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirIncrementoEnCincoDoWhile(int nPosiciones) {
        int contador = 0, valor = 3;
        do {
            System.out.print(valor + " ");
            valor += 5;
        } while (++contador < nPosiciones);
    }

    /**
     * Imprime los términos de la serie utilizando un bucle while y un incremento constante de 5.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirIncrementoEnCincoWhile(int nPosiciones) {
        int contador = 0, valor = 3;
        while (contador++ < nPosiciones) {
            System.out.print(valor + " ");
            valor += 5;
        }
    }
}