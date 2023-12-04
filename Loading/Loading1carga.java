package Loading;

/**
 * Clase que implementa un indicador de carga con movimiento rotacional.
 * Utiliza los signos \|/-| para simular el progreso de carga desde 0% hasta 100%.
 *
 * @author Jonathan Paredes
 * @version 2.43
 * @since 03-12-2023
 * @license L01) Indicador de carga desde 0 a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%
 */
public class Loading1carga {

    /**
     * Método para simular la carga con un indicador visual rotacional.
     */
    public void cargaRotacional() {
        int totalSteps = 20; 
        int delayMillis = 100; 

        for (int i = 0; i <= totalSteps; i++) {
            System.out.print("\rLoading: " + getLoadingBar(i, totalSteps));

            try {
                Thread.sleep(delayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nLoading complete!");
    }

    
    private static String getLoadingBar(int currentStep, int totalSteps) {
        int progress = (int) ((double) currentStep / totalSteps * 100);
        int numOfSymbols = currentStep % 4;

        
        StringBuilder loadingBar = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            if (i < numOfSymbols) {
                loadingBar.append(getLoadingSymbol(i));
            } else {
                loadingBar.append(" ");
            }
        }
        loadingBar.append("] ").append(progress).append("%");
        return loadingBar.toString();
    }

  
    private static char getLoadingSymbol(int index) {
        char[] symbols = {'|', '\\', '/', '-'};
        return symbols[index % symbols.length];
    }
}
