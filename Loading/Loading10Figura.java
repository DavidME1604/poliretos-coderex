package Loading;

public class Loading10Figura {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Mover la figura de derecha a izquierda
     *      \|||/
     *      (> <)
     *   ooO-(_)-Ooo
     * 
     *
     */
    public  void Figura() {
        animarFigura();
    }

    public static void animarFigura() {
        int desplazamientoMaximo = 10;
        int delayMillis = 100;

        for (int i = 0; i < desplazamientoMaximo; i++) {
            imprimirFigura(i);
            esperar(delayMillis);
            borrarConsola();
        }

        for (int i = desplazamientoMaximo - 2; i >= 0; i--) {
            imprimirFigura(i);
            esperar(delayMillis);
            borrarConsola();
        }
    }

    public static void imprimirFigura(int desplazamiento) {

        for (int i = 0; i < desplazamiento; i++) {
            System.out.print(" ");
        }

        System.out.println("  \\|||/");
        for (int i = 0; i < desplazamiento; i++) {
            System.out.print(" ");
        }
        System.out.println("   (> <)");
        for (int i = 0; i < desplazamiento; i++) {
            System.out.print(" ");
        }
        System.out.println("ooO-(_)-Ooo");
    }

    public static void borrarConsola() {

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
