public class Serie2ImparCero {
    /*
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S7: 1 4 7 10 13 16 19 22 25 ...
     */

    /**
     * IncremenoTresFor calcula la serie usando el ciclo For : 1 4 7 10 13 16 19 22
     * 25 ...
     * 
     * @param nPosiciones
     */
    public void ImparesCeroFor(int nPosiciones) {
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print((i % 2 != 0) ? i + " " : 0 + " ");
        }
    }

    /**
     * IncremenoTresDoWHile calcula la serie usando el ciclo Do-While : 1 4 7 10 13 16
     * 19 22 25 ...
     * 
     * @param nPosiciones
     */
    public void ImparesCeroDo(int nPosiciones) {
        int cont = 1;
        do {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        } while (cont++ < nPosiciones);
    }

    /**
     * IncremenoTresWhile calcula la serie usando el ciclo While : 1 4 7 10 13 16 19
     * 22 25 ...
     * 
     * @param nPosiciones
     */
    public void ImparesCeroWhile(int nPosiciones) {
        int cont = 0;
        while (++cont <= nPosiciones) {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        }
    }
}
