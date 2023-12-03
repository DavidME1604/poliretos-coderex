package Loading;

public class Loading5BarraPorciento {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear una barra es de 20 caracteres, la barra avanza cambiando la punta entre > -          3
        [=======>           ] 20%
     *  
     *
     */

    
    public void BarraPorciento(){
    int longitudBarra = 20;
        int porcentaje = 100;
        int delayMilisegundos = 100;

        for (int i = 0; i <= porcentaje; i++) {
            int caracteresLlenos = (i * longitudBarra) / 100;
            mostrarBarraDeProgreso(caracteresLlenos, longitudBarra);
            try {
                Thread.sleep(delayMilisegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i < caracteresLlenos) {
                if (i == caracteresLlenos - 1) {
                    System.out.print(">");
                } else {
                    System.out.print("=");
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("] " + caracteresLlenos * 5 + "%\r");
    }
}
