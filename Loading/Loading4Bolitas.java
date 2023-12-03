package Loading;
/**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Carga con oo0
     */

public class Loading4Bolitas {
    
    public void bolitas() {
        String[] figuras = { "0oo", "o0o", "oo0","o0o"};
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
