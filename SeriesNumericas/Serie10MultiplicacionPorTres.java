package SeriesNumericas;
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
     *@param numeroElementos
     */
    public void MultiplicacionPor3For(int numeroElementos) {
        int primerTermino = 3;
        for (int i = 1; i <= numeroElementos; i++) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
        }
    }

    /**
     *MultiplicacionPorTres calcula usando Do: 3  9  27  81  243  729  2187.... 
     *
     *@param numeroElementos
     */
    public void MultiplicacionPor3Do(int numeroElementos) {
        int primerTermino = 3;
        int i = 0;
        do {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        } while (i < numeroElementos);
    }

    /**
     * IncremenoTresFor calcula la serie usando el ciclo While : 2  6   12  20  30  42  56  72  ...
     * @param numeroElementos
     */
    public void MultiplicacionPor3While(int numeroElementos) {
        int primerTermino = 3;
        int i = 0;
        while (i < numeroElementos) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        }
    }

}
