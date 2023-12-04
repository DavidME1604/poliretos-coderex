package Loading;

/**
 * Clase que implementa un indicador de carga con una barra que se desplaza de izquierda a derecha.
 * La barra tiene una longitud de 20 caracteres y se desplaza durante el progreso.
 *
 * @author Jonathan Paredes
 * @version 2.43
 * @since 03-12-2023
 * @license Loading, Usar el delay para animar
 */
public class Loading6barra {

    /**
     * Método para simular la carga con una barra que se desplaza de izquierda a derecha.
     */
    public void barraDesplazante() {
        int longitudBarra = 20;
        int delayMillis = 100; 

        for (int i = 0; i <= 100; i++) {
            System.out.print("\rLoading: " + getDesplazanteBar(i, longitudBarra));

            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nLoading complete!");
    }

    
    private static String getDesplazanteBar(int progress, int longitudBarra) {
        int currentPosition = (int) ((double) progress / 100 * (longitudBarra - 2)); // Restar 2 para dejar espacio en los extremos
        StringBuilder barraDesplazante = new StringBuilder("[");

        for (int i = 0; i < longitudBarra - 2; i++) {
            if (i == currentPosition) {
                barraDesplazante.append("<=");
            } else {
                barraDesplazante.append(" ");
            }
        }

        barraDesplazante.append("] ").append(progress).append("%");
        return barraDesplazante.toString();
    }
}
