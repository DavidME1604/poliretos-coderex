package Figuras;

/**
 * Clase que genera la Figura4.
 * 
 * <p>
 * La Figura4 consiste en imprimir '*' en forma de triángulo invertido,
 * donde el número de '*' en cada fila está determinado por el nivel.
 * </p>
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Figura4 {

    /**
     * Genera la Figura4 con el tamaño especificado.
     * 
     * @param niveles El número de niveles/tamaño de la figura.
     */
    public void generarFigura4(int tamanioFigura) {
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 0; j < tamanioFigura - i - 1; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
