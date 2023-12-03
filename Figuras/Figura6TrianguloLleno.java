package Figuras;

public class Figura6TrianguloLleno {
 /**
         * Imprime una pirámide invertida con asteriscos (*)
         * @param tamanioFigura
         */
    public void TrianguloLleno(int tamanioFigura) {
        
        for (int i = 0; i < tamanioFigura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = tamanioFigura - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
