package Loading;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0 
     * @since 2023-12-01
     * @license
     *         
     */

    public class Loading3movCaracter{

    public void movCaracter(char simbolo) {
        int longitudBarra = 20;

        for (int i = 0; i <= longitudBarra; i++) {
            String barra = "[" + desplazarSimbolo(simbolo, i, longitudBarra) + "] " + (i * 2.5) + "%";
            System.out.print("\r" + barra);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = longitudBarra; i >= 0; i--) {
            String barraIzq = "[" + desplazarSimbolo(simbolo, i, longitudBarra) + "] " + (i * 2.5) + "%"; 
            System.out.print("\r" + barraIzq);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String desplazarSimbolo(char simbolo, int posicion, int longitudBarra) {
        StringBuilder barraBuilder = new StringBuilder();
        for (int i = 0; i < longitudBarra; i++) {
            if (i == posicion) {
                barraBuilder.append(simbolo);
            } else {
                barraBuilder.append(" ");
            }
        }
        return barraBuilder.toString();
    }
}
