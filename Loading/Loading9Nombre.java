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
 *          Carga con tu nombre
 */

public class Loading9Nombre {
    /**
     * 
     * @param nombre
     */
    public void Nombre(String nombre) {
        short contador = -1;
        int patron = 100 / nombre.length();
        for (int i = patron; i < patron * nombre.length() + 1; i += patron) {
            contador++;
            System.out.print(
                    "\r" + "[" + " ".repeat(contador) + nombre.charAt(contador)
                            + " ".repeat(nombre.length() - 1 - contador) + "] " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\r" + "[" + " ".repeat(contador) + nombre.charAt(contador) + "] " + "100%");
    }

    /*
     * public void Nombre(String nombre) {
     * 
     * String[] partes = new String[nombre.length()];
     * for (int i = 0; i < nombre.length(); i++) {
     * partes[i] = "";
     * }
     * for (int i = 0; i < nombre.length(); i++) {
     * for (int j = 0; j < nombre.length(); j++) {
     * if (i == j) {
     * partes[j] = partes[j] + nombre.charAt(i);
     * } else {
     * partes[j] = partes[j] + " ";
     * }
     * }
     * }
     * int patron = (int) 100 / nombre.length();
     * 
     * int acumulador = patron;
     * for (int i = 0; i <= 100; i++) {
     * System.out.print("\r[" + partes[(acumulador / patron) - 1] + "] " + i + "%");
     * if (i == acumulador && (acumulador / patron) < partes.length) {
     * acumulador = acumulador + patron;
     * }
     * try {
     * Thread.sleep(250);
     * } catch (InterruptedException e) {
     * Thread.currentThread().interrupt();
     * }
     * }
     * }
     */
}
