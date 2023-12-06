package Arrays;

/**
     * Presenta tu nombre en un plano.
     * 
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-05
     * 
     * @license
 */

public class Arrays3NombrePlano {

    public void imprimirNombreEscaleraHaciaLaDerecha(String name) {

        for (int imprimir = 0; imprimir < name.length(); imprimir++) {

            boolean segundoBucleEjecutado = false;

            for (int m = name.length() - imprimir; m >= 0; m--) {
                System.out.printf("%2d |", m);

                for (int espacioRec = name.length() - 1; espacioRec > imprimir; espacioRec--) {
                    System.out.print(" ");
                }
                
                System.out.println(name.charAt(name.length() - imprimir - 1));

                if (!segundoBucleEjecutado) {
                    segundoBucleEjecutado = true;
                    break;
                }
            }
        }
        System.out.printf(" 0 |%s%n", "_".repeat(name.length()));       
    }
}
