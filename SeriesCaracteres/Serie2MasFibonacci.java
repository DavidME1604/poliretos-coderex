package SeriesCaracteres;
/**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...  
     */
public class Serie2MasFibonacci {

    /**
     * Serie S2 con For
     * @param numeroElementos
     */
    public void SerieMasFibonacciFor(int numeroElementos){
        for (int i = 0, nActual = 0, nSiguiente = 1; i <= numeroElementos; nSiguiente+=nActual, nActual = nSiguiente-nActual, i++) {
            for (int j = 0; j < nActual; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
        }
    }
}
