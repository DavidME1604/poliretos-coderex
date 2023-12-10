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
    public void movimientoBarra() {
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90;i+=10) {
            
            while (espaciosAtras <= 20) {
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + 100 + "%");
    }
}
