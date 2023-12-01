package SeriesNumericas;
public class Serie7IncrementoTres {
    /**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S7: 1  4  7  10  13  16  19  22  25  ...
     */

    /**
     * IncremenoTresFor calcula la serie usando el ciclo For : 1  4  7  10  13  16  19  22  25  ...
     * 
     * @param numeroElementos
     */
    public void IncrementoTresFor(int numeroElementos) {
        for (int i = 0, numero = 1; i < numeroElementos; numero += 3, i++) {
            System.out.print(numero + " ");
        }
    }

    /**
     * IncremenoTresDo calcula la serie usando el ciclo Do-While : 1  4  7  10  13  16  19  22  25  ...
     * 
     * @param numeroElementos
     */
    public void IncrementoTresDo(int numeroElementos) {
        int cont = 0, numero = 1;
        do {
            System.out.print(numero + " ");
            numero += 3;
            ;
        } while (++cont < numeroElementos);
    }

    /**
     * IncremenoTresWhile calcula la serie usando el ciclo While : 1  4  7  10  13  16  19  22  25  ...
     * 
     * @param numeroElementos
     */
    public void IncrementoTresWhile(int numeroElementos) {
        int cont = 0, numero = 1;
        while (cont++ < numeroElementos) {
            System.out.print(numero + " ");
            numero += 3;
        }
    }
}
