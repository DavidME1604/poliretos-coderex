package SeriesNumericas;
/**
 * Clase que representa la generación de la serie Fibonacci.
 * 
 * <p>
 * La serie Fibonacci sigue un patrón en el que cada término es la suma de los dos anteriores.
 * Comienza con los términos 0 y 1. Por lo tanto, la serie se forma como sigue: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * </p>
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 23 de noviembre de 2023
 */
public class Serie1Fibonacci {

    /**
     * Imprime los términos de la serie Fibonacci utilizando un bucle for.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirFibonacciFor(int numeroElementos) {
        int valor1 = 0, valor2 = 1;
        System.out.print(valor1 + " " + valor2 + " ");
        for (int contador = 2; contador < numeroElementos; contador++) {
            int temp = valor1 + valor2;
            System.out.print(temp + " ");
            valor1 = valor2;
            valor2 = temp;
        }
    }

    /**
     * Imprime los términos de la serie Fibonacci utilizando un bucle do-while.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirFibonacciDoWhile(int numeroElementos) {
        int contador = 0, valor1 = 0, valor2 = 1;
        System.out.print(valor1 + " " + valor2 + " ");
        do {
            int temp = valor1 + valor2;
            System.out.print(temp + " ");
            valor1 = valor2;
            valor2 = temp;
            contador++;
        } while (contador + 2 < numeroElementos);
    }

    /**
     * Imprime los términos de la serie Fibonacci utilizando un bucle while.
     * 
     * @param numeroElementos El número de términos que se imprimirán.
     */
    public void imprimirFibonacciWhile(int numeroElementos) {
        int contador = 0, valor1 = 0, valor2 = 1;
        System.out.print(valor1 + " " + valor2 + " ");
        while (contador + 2 < numeroElementos) {
            int temp = valor1 + valor2;
            System.out.print(temp + " ");
            valor1 = valor2;
            valor2 = temp;
            contador++;
        }
    }
}
