/**
 * Clase que implementa un método recursivo para realizar un conteo regresivo desde un número dado hasta 0.
 *
 * @author Jonathan Paredes
 * @version 1.0
 * @since 03-12-2023
 */
package Recursividad;

public class Recursividad6ConteoRegresivo {

    /**
     * Realizar conteo regresivo e imprimir avance
     * @param n Número desde el cual iniciar el conteo
     */
    public void conteoRegresivo(int n) {
        if (n < 0) {
            System.out.println("Número ingresado es negativo. El conteo regresivo no es posible.");
        } else {
            conteoRegresivoRecursivo(n);
        }
    }

    private void conteoRegresivoRecursivo(int n) {
        if (n == 0) {
            System.out.println("¡Cuenta regresiva completa!");
        } else {
            System.out.println("Conteo regresivo: " + n);
            conteoRegresivoRecursivo(n - 1);
        }
    }
}
