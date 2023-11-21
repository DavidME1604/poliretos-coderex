/**
 * Clase que representa la generación de la serie cinco.
 * 
 *  * <p>
 * La serie S5 sigue un patrón de aumento en los números primos. Por lo tanto, 
 * la serie se forma como sigue: 3, 8, 13, 18, 23, 28, 33, 38, ..
 * </p>
 * 
 * @author: Elizabeth Lorena Lopez Zelaya
 * @version: 1.0
 * @since: 19 noviembre de 2023
 */

public class Serie5Primos {
    
    /**
     * Imprime los números primos utilizando un bucle while y un contador.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirPrimosWhile(int nPosiciones) {
        int contador = 0;
        int numero = 2;

        while (contador < nPosiciones) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }

    /**
     * Imprime los números primos utilizando un bucle do-while y un contador.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirPrimosDoWhile(int nPosiciones) {
        int contador = 0;
        int numero = 2;
        
        do {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        } while (contador < nPosiciones);
    }

    /**
     * Imprime los números primos utilizando un bucle for y un contador.
     * 
     * @param nPosiciones El número de términos que se imprimirán.
     */
    public void imprimirPrimosFor(int nPosiciones) {
        for (int contador = 0, numero = 2; contador < nPosiciones; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
        }
    }

    /**
     * Verifica si un número es primo.
     * 
     * @param numero El número a verificar.
     * @return true si el número es primo, false de lo contrario.
     */
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) { 
                return false;
            }
        }
        return true;
    }
    
}
