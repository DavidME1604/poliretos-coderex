public class Serie7IncrementoTres {
    /*
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S2: 1 0 3 0 5 0 7 0 9 ...
     */

    /**
     * IncremenoTresFor calcula la serie usando el ciclo For : 1 0 3 0 5 0 7 0 9 ...
     * 
     * @param nPosiciones
     */
    public void IncrementoTresFor(int nPosiciones) {
        for (int i = 0, numero = 1; i < nPosiciones; numero += 3, i++) {
            System.out.print(numero + " ");
        }
    }

    /**
     * IncremenoTresDoWHile calcula la serie usando el ciclo Do-While : 1 0 3 0 5 0 7 0
     * 9 ...
     * 
     * @param nPosiciones
     */
    public void IncrementoTresDo(int nPosiciones) {
        int cont = 0, numero = 1;
        do {
            System.out.print(numero + " ");
            numero += 3;
            ;
        } while (++cont < nPosiciones);
    }

    /**
     * IncremenoTresWhile calcula la serie usando el ciclo While : 1 0 3 0 5 0 7 0 9
     * ...
     * 
     * @param nPosiciones
     */
    public void IncrementoTresWhile(int nPosiciones) {
        int cont = 0, numero = 1;
        while (cont++ < nPosiciones) {
            System.out.print(numero + " ");
            numero += 3;
        }
    }
}
