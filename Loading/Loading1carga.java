package Loading;
/* 
 * Clase que implementa un indicador de carga con movimiento rotacional.
 * Utiliza los signos \|/-| para simular el progreso de carga desde 0% hasta 100%.
 *
 * @author Jonathan Paredes
 * @version 2.55
 * @since 03-12-2023
 * @license L01) Indicador de carga desde 0 a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
 */
public class Loading1carga {

    /**
     * Método para simular la carga con un indicador visual rotacional.
     */

    public void cargaRotacional(){
        String[] figuras = { "\\", "|", "/","-"};
        for (int i = 0; i <= 100; i ++) {
                System.out.print("\r" + figuras[i%4]+" "+ i+"%");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
    }
}
