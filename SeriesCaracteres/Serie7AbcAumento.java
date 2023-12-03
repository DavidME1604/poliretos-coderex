package SeriesCaracteres;

public class Serie7AbcAumento {
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
    public void AbcAumento(int numeroElementos){
    int numGrupos = numeroElementos;
    System.out.println("Serie 7 usando  For: " + generarSerieConFor(numGrupos));
    System.out.println("Serie 7 usando while: " + generarSerieConWhile(numGrupos));
    System.out.println("Serie 7 usando do-while: " + generarSerieConDoWhile(numGrupos));
    }

    public static String generarSerieConFor(int numGrupos) {
        StringBuilder resultado = new StringBuilder();
        char caracter = 'a';

        for (int i = 1; i <= numGrupos; i++) {
            resultado.append(repetirCaracter(caracter, i * 2));

            if (i < numGrupos) {
                resultado.append(" ");
            }

            caracter += 1; // Avanza en el abecedario
        }

        return resultado.toString();
    }

    public static String generarSerieConWhile(int numGrupos) {
        StringBuilder resultado = new StringBuilder();
        char caracter = 'a';
        int i = 1;

        while (i <= numGrupos) {
            resultado.append(repetirCaracter(caracter, i * 2));

            if (i < numGrupos) {
                resultado.append(" ");
            }

            i++;
            caracter += 1; // Avanza en el abecedario
        }

        return resultado.toString();
    }

    public static String generarSerieConDoWhile(int numGrupos) {
        StringBuilder resultado = new StringBuilder();
        char caracter = 'a';
        int i = 1;

        do {
            resultado.append(repetirCaracter(caracter, i*2 ));

            if (i < numGrupos) {
                resultado.append(" ");
            }

            i++;
            caracter += 1; // Avanza en el abecedario
        } while (i <= numGrupos);

        return resultado.toString();
    }

    public static String repetirCaracter(char caracter, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}

