public class Serie8SumaCinco {
    /**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S8: 3 8 13 18 23 28 33 38...
     */

    /**
     * SumaCincoFor calcula la serie usando el ciclo For : 2 3 5 7 11 13 17 19 23 29
     * 
     * @param numeroElementos
     */
    public void SumaCincoFor(int numeroElementos) {
        for (int i = 3, contadorElementos = 0; contadorElementos < numeroElementos; i += 5, contadorElementos++) {
            System.out.print(i + " ");
        }
    }

    /**
     * SumaCincoDo calcula la serie usando el ciclo For : 2 3 5 7 11 13 17 19 23 29
     * 
     * @param numeroElementos
     */
    public void SumaCincoDo(int numeroElementos) {
        int contadorElementos = 0, numero = 3;
        do {
            System.out.print(numero + " ");
            numero += 5;
        } while (contadorElementos++ < numeroElementos - 1);
    }

    /**
     * SumaCincoWhile calcula la serie usando el ciclo For : 2 3 5 7 11 13 17 19 23
     * 
     * @param numeroElementos
     */
    public void SumaCincoWhile(int numeroElementos) {
        int contadorElementos = 0, numero = 3;
        while (contadorElementos++ < numeroElementos) {
            System.out.print(numero + " ");
            numero += 5;
        }
    }
}
