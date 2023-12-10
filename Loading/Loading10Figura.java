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
     *          Desplazar la figura a la derecha y regresar
     *          \|||/
     *          (> <)
     *          ooO-(_)-Ooo
     */
    public void Figura() {
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90; i += 10) {

            while (espaciosAtras <= 20) {
                System.out.print("\033[H\033[2J"); // Limpia la consola
                System.out.flush();
                System.out.println(" ".repeat(espaciosAtras) + "   \\|||/" + " ".repeat(espaciosAdelante));
                System.out.println(" ".repeat(espaciosAtras) + "   (> <)" + " ".repeat(espaciosAdelante));
                System.out.println(" ".repeat(espaciosAtras) + "ooO-(_)-Ooo" + " ".repeat(espaciosAdelante));
                System.out.println("Cargando..." + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(35);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print("\033[H\033[2J"); // Limpia la consola
                System.out.flush();
                System.out.println(" ".repeat(espaciosAtras) + "   \\|||/" + " ".repeat(espaciosAdelante));
                System.out.println(" ".repeat(espaciosAtras) + "   (> <)" + " ".repeat(espaciosAdelante));
                System.out.println(" ".repeat(espaciosAtras) + "ooO-(_)-Ooo" + " ".repeat(espaciosAdelante));
                System.out.println("Cargando..." + i + "%");
                try {
                    Thread.sleep(35);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
