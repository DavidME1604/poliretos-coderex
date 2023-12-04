package Figuras;
import java.util.Scanner;

/**
 * Clase que genera la Figura14triangulo.
 * 
 * <p>
 * La Figura14triangulo consiste en imprimir los coeficientes del triángulo de Pascal.
 * </p>
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Figura14triangulo {

    /**
     * Genera la Figura14triangulo con el número de filas especificado.
     * 
     * @param numRows El número de filas de la Figura14triangulo.
     */
    public void generarFigura14triangulo(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Imprimir espacios en blanco antes de los números
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  ");
            }

            // Imprimir los números
            int coeficiente = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", coeficiente);
                coeficiente = coeficiente * (i - k) / (k + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la Figura14triangulo: ");
        
        // Leer el número de filas de la Figura14triangulo
        int numRows = scanner.nextInt();

        // Crear una instancia de la clase Figura14triangulo
        Figura14triangulo figura14triangulo = new Figura14triangulo();

        // Generar la Figura14triangulo con el número de filas especificado
        figura14triangulo.generarFigura14triangulo(numRows);

        // Cerrar el scanner
        scanner.close();
    }
}
