package SeriesCaracteres;

public class Serie8AbcAumento {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear la siguiente serie:
     * aa   bbbb  cccccc  dddddddd    ...               
     * 
     *  
     *...
     */
    /*
     * @param nombre
     * @param apellido
     */

    public void generarSerieConFor(int numGrupos) {
        StringBuilder resultado = new StringBuilder();
        char caracter = 'a';

        for (int i = 1; i <= numGrupos; i++) {
            resultado.append(repetirCaracter(caracter, i * 2));

            if (i < numGrupos) {
                resultado.append(" ");
            }

            caracter += 1; // Avanza en el abecedario
        }

        System.out.println(resultado.toString());
    }

    public static String repetirCaracter(char caracter, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}

