public class Serie2ImparCero {
    /**
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
     * ImparesCeroFor calcula la serie usando el ciclo For : 1 0 3 0 5 0 7 0 9 ...
     * 
     * @param numeroElementos
     */
    public void ImparesCeroFor(int numeroElementos) {
        for (int i = 1; i <= numeroElementos; i++) {
            System.out.print((i % 2 != 0) ? i + " " : 0 + " ");
        }
    }

    /**
     * ImparesCeroDo calcula la serie usando el ciclo Do-While : 1 0 3 0 5 0 7 0 9 ...
     * 
     * @param numeroElementos
     */
    public void ImparesCeroDo(int numeroElementos) {
        int cont = 1;
        do {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        } while (cont++ < numeroElementos);
    }

    /**
     * ImparesCeroWhile calcula la serie usando el ciclo While : 1 0 3 0 5 0 7 0 9 ...
     * 
     * @param numeroElementos
     */
    public void ImparesCeroWhile(int numeroElementos) {
        int cont = 0;
        while (++cont <= numeroElementos) {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        }
    }
}
