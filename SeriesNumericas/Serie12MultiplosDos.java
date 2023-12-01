package SeriesNumericas;
public class Serie12MultiplosDos {
    /**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S12: 2 6 12 20 30 42 56 72 ...
     */

    /**
     * MultiplosDosFor calcula la serie usando el ciclo For : 2 6 12 20 30 42 56 72
     * 
     * @param numeroElementos
     */
    public void MultiplosDosFor(int numeroElementos) {
        for (int i = 1, nAnt = 0; i <= numeroElementos; nAnt += i * 2, i++) {
            System.out.print(i * 2 + nAnt + " ");
        }
    }

    /**
     * MultiplosDosDo calcula la serie usando el ciclo Do-While : 2 6 12 20 30 42
     * 
     * @param numeroElementos
     */
    public void MultiplosDosDo(int numeroElementos) {
        int nActual = 1, nAnt = 0;
        do {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        } while (nActual++ < numeroElementos);
    }

    /**
     * MultiplosDosWhile calcula la serie usando el ciclo While : 2 6 12 20 30 42 56
     * 
     * @param numeroElementos
     */
    public void MultiplosDosWhile(int numeroElementos) {
        int nActual = 0, nAnt = 0;
        while (++nActual <= numeroElementos) {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        }
    }
}
