package Loading;

/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *         
     */

public class Loading8NombreApellido {

    public void loading8NombreApellido(String nombreCompleto) {
        String nombrePartes = "";
        short contador = -1;
        int patron = 100 / nombreCompleto.length();
        for (int i = patron; i < patron * nombreCompleto.length() + 1; i += patron) {
            contador++;
            nombrePartes += nombreCompleto.charAt(contador);
            System.out.print(
                    "\r" + "[" + nombrePartes + " ".repeat(nombreCompleto.length() - 1 - contador) + "] " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\r" + "[" + nombrePartes + "] " + "100%");
    }
}
