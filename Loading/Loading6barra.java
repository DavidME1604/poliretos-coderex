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
    

    public static void mostrarBarraDesplazamiento(int porcentaje) {
        int longitudBarra = 20;
        int posicionFlecha = (int) Math.ceil((porcentaje / 100.0) * longitudBarra);

        //Construir la barra de desplazamiento
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i == posicionFlecha) {
                barra.append(" <=> ");
            } else {
                barra.append(" ");
            }
        }
        barra.append("] ").append(porcentaje).append("%");

        //Barra animada
        System.out.print("\r" + barra.toString());
    }

    public static void pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
