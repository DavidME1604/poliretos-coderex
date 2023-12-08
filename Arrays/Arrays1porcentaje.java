package Arrays;
/**
 * Clase que permite ingresar un nombre completo, solicitar porcentajes de carga
 * para cada palabra 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Arrays1porcentaje {
    public void cargaPorcentajeNombre(String[] nombre, int[] porcentajes) {

        for (int i = 0; i < nombre.length; i++) {
            mostrarBarra(nombre[i], porcentajes[i]);
        }

    }

    private void mostrarBarra(String palabra, int porcentaje) {
        int largoBarra = porcentaje / 5;
        int espacios = 20 - largoBarra;
        int porcentajeResta = 100 - porcentaje;
        palabra = palabra.substring(0, palabra.length() - (porcentajeResta * palabra.length()) / 100);

        System.out.println("[" + "=".repeat(largoBarra) + ">" + " ".repeat(espacios) + "]" + porcentaje + "% " + palabra);
    }
}

