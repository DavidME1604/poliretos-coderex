package SeriesCaracteres;

/**
 * Clase que representa la serie Serie4Caracteres.
 * 
 * <p>
 * La serie Serie4Caracteres sigue un patrón en el que alterna entre los caracteres
 * +, -, *, y / 
 * </p>
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Serie4Caracteres {

    /**
     * Genera la serie Serie4Caracteres utilizando un bucle for.
     * 
     * @param numeroCaracteres El número total de caracteres en la serie.
     */
    public void generarSerieFor(int numeroCaracteres) {
        char[] caracteres = { '+', '-', '*', '/' };

        for (int i = 0; i < numeroCaracteres; i++) {
            char caracterActual = caracteres[i % caracteres.length];
            System.out.print(caracterActual + " ");
        }
    }

    /**
     * Genera la serie Serie4Caracteres utilizando un bucle while.
     * 
     * @param numeroCaracteres El número total de caracteres en la serie.
     */
    public void generarSerieWhile(int numeroCaracteres) {
        char[] caracteres = { '+', '-', '*', '/' };
        int contador = 0;

        while (contador < numeroCaracteres) {
            char caracterActual = caracteres[contador % caracteres.length];
            System.out.print(caracterActual + " ");
            contador++;
        }
    }

    /**
     * Genera la serie Serie4Caracteres utilizando un bucle do-while.
     * 
     * @param numeroCaracteres El número total de caracteres en la serie.
     */
    public void generarSerieDoWhile(int numeroCaracteres) {
        char[] caracteres = { '+', '-', '*', '/' };
        int contador = 0;

        do {
            char caracterActual = caracteres[contador % caracteres.length];
            System.out.print(caracterActual + " ");
            contador++;
        } while (contador < numeroCaracteres);
    }
}
