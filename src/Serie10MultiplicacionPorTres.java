public class Serie10MultiplicacionPorTres {
/*
 *@author José David Pallares Santamaría
 *
 *@version 2.0
 *
 *@since 2023-11-21
 *
 *@license
 *
 *Serie  S10:  3  9  27  81  243  729  2187 ....
*/

    /**
     *MultiplicacionPorTres calcula usando For: 3  9  27  81  243  729  2187.... 
     *
     *@param nPosiciones
     */
    public void MultiplicacionPor3For(int nPosiciones) {
        int primerTermino = 3;
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
        }
    }

    /**
     *MultiplicacionPorTres calcula usando Do: 3  9  27  81  243  729  2187.... 
     *
     *@param nPosiciones
     */
    public void MultiplicacionPor3Do(int nPosiciones) {
        int primerTermino = 3;
        int i = 0;
        do {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        } while (i < nPosiciones);
    }

    /**
     * IncremenoTresFor calcula la serie usando el ciclo While : 2  6   12  20  30  42  56  72  ...
     * @param nPosiciones
     */
    public void MultiplicacionPor3While(int nPosiciones) {
        int primerTermino = 3;
        int i = 0;
        while (i < nPosiciones) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        }
    }

}
