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
public class Loading6Barra {
    public void iniciarBarraDeslizante() {
        int retardo = 2000;
        int pasos = 20;

        for (int i = 0; i <= pasos; i++) {
            mostrarBarraDesplazamiento(i, pasos, i == pasos);
            pausar(retardo / pasos);
        }

        for (int i = pasos; i >= 0; i--) {
            mostrarBarraDesplazamiento(i, pasos, i == 0);
            pausar(retardo / pasos);
        }
    }

    private static void mostrarBarraDesplazamiento(int progreso, int total, boolean mostrarPorcentaje) {
        int longitudBarra = 20;
        int posicionFlecha = (int) Math.ceil((progreso / (double) total) * longitudBarra);

        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i == posicionFlecha) {
                barra.append(" <=> ");
            } else {
                barra.append(" ");
            }
        }
        barra.append("] ");

        if (mostrarPorcentaje) {
            barra.append("100%");
        }

        System.out.print("\r" + barra.toString());
    }

    private static void pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
