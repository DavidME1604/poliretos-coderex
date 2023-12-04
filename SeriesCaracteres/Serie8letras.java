package SeriesCaracteres;
/**
 * Clase que representa la serie Serie8letras.
 * 
 * <p>
 * La serie Serie8letras sigue un patrón en el que cada término consiste en una letra
 * seguida por un número de repeticiones de esa letra,
 * está determinado por la posición del término en la serie.
 * </p>
 * 
 * @author  Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Serie8letras {

    /**
     * Genera la serie Serie8letras utilizando un bucle for.
     * 
     * @param numeroTerminos El número total de términos en la serie.
     */
    public void generarSerieFor(int numeroTerminos) {
        for (int i = 0; i < numeroTerminos; i++) {
            char letra = (char) ('a' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(letra);
            }

            if (i < numeroTerminos - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * Genera la serie Serie8letras utilizando un bucle while.
     * 
     * @param numeroTerminos El número total de términos en la serie.
     */
    public void generarSerieWhile(int numeroTerminos) {
        int i = 0;

        while (i < numeroTerminos) {
            char letra = (char) ('a' + i);
            int j = 0;

            while (j <= i) {
                System.out.print(letra);
                j++;
            }

            if (i < numeroTerminos - 1) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();
    }

    /**
     * Genera la serie Serie8letras utilizando un bucle do-while.
     * 
     * @param numeroTerminos El número total de términos en la serie.
     */
    public void generarSerieDoWhile(int numeroTerminos) {
        int i = 0;

        do {
            char letra = (char) ('a' + i);
            int j = 0;

            do {
                System.out.print(letra);
                j++;
            } while (j <= i);

            if (i < numeroTerminos - 1) {
                System.out.print(" ");
            }
            i++;
        } while (i < numeroTerminos);
        System.out.println();
    }
}
