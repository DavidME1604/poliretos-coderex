public class Serie12MultiplosDos {
    /*
     * @author David Esteban Morales Estrella
     * 
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S12: 2 6 12 20 30 42 56 72 ...
     */

    /**
     * IncremenoTresFor calcula la serie usando el ciclo For : 2 6 12 20 30 42 56 72
     * ...
     * 
     * @param nPosiciones
     */
    public void MultiplosDosFor(int nPosiciones) {
        for (int i = 1, nAnt = 0; i <= nPosiciones; nAnt += i * 2, i++) {
            System.out.print(i * 2 + nAnt + " ");
        }
    }

    /**
     * IncremenoTresDoWhile calcula la serie usando el ciclo Do-While : 2 6 12 20 30 42
     * 56 72 ...
     * 
     * @param nPosiciones
     */
    public void MultiplosDosDo(int nPosiciones) {
        int nActual = 1, nAnt = 0;
        do {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        } while (nActual++ < nPosiciones);
    }

    /**
     * IncremenoTresWhile calcula la serie usando el ciclo While : 2 6 12 20 30 42 56
     * 72 ...
     * 
     * @param nPosiciones
     */
    public void MultiplosDosWhile(int nPosiciones) {
        int nActual = 0, nAnt = 0;
        while (++nActual <= nPosiciones) {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        }
    }
}
