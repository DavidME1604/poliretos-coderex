/**
 * Clase que implementa un método recursivo para obtener la factorial de un número.
 *
 * @author Jonathan Paredes
 * @version 1.0
 * @since 03-12-2023
 */
package Recursividad;

import java.util.Scanner;

public class Recursividad1factorial {

    /**
     * Imprimir el factorial recursivo
     * @param n Número para calcular el factorial
     */
    public void imprimirFactorial(int n) {
        System.out.println("El factorial de " + n + " es igual a: " + factorial(n));
    }

    /**
     * Método recursivo para calcular el factorial
     * @param n Número para calcular el factorial
     * @return Factorial de n
     */
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
