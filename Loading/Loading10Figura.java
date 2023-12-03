package Loading;

public class Loading10Figura {
    /**
     * @author Jose David Pallares Santamaria
     * @Github JosDavP
     * @version 2.0
     * 
     * @since 2023-12-03
     * 
     * @license
     * 
     *  Desplazar la figura a la derecha y regresar            
     *    \|||/
     *    (> <)
     * ooO-(_)-Ooo
     */
    public void Figura() {
        int distancia = 20; 

        for (int i = 0; i <= distancia * 2; i++) {

            boolean haciaDerecha = i < distancia;

            int espacios = haciaDerecha ? distancia - i : i - distancia;

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            System.out.print("    \\|||/");
            System.out.println();

            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }

            System.out.print("    (> <)");
            System.out.println();

            for (int l = 0; l < espacios; l++) {
                System.out.print(" ");
            }

            System.out.println(" ooO-(_)-Ooo");

            int porcentaje = (int) (((double) i / (distancia * 2)) * 100);
            System.out.println("Porcentaje: " + porcentaje + "%");

            try {

                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
