package Arrays;
import java.util.Random;

public class Arrays5MatrizAleatoria {
        /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.             3
     *   En el caso que conincidan las posiciones poner un *.
     * Para visulizar el proceso usar un delay
     *
     */
    
    public void MatrizAleatoria(String nombreCompleto) {

        System.out.println("Ingresa tu nombre completo:");
        int tamanoMatriz = nombreCompleto.length();

        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }
        Random random = new Random();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);

            int fila, columna;
            do {
                fila = random.nextInt(tamanoMatriz);
                columna = random.nextInt(tamanoMatriz);
            } while (matriz[fila][columna] != ' ');

            matriz[fila][columna] = letra;
        }
        imprimirMatriz(matriz);
    }
    private static void imprimirMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
