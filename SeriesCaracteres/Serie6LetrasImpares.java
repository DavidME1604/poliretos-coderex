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
     * S6:  a  +   c   -   e   +   g   -   ... 
     */
public class Serie6LetrasImpares {
    /**
     * Serie S6 con For
     * @param numeroElementos
     */
    public void letrasImparesFor(int numeroElementos) {
        char letraActual, caracterAlternancia = '+';
        for (int i = 0, letraASCII = 97; i < numeroElementos; i++, letraASCII++) {
            letraActual = (char) letraASCII;
            System.out.print((letraASCII % 2 == 0) ? " " + caracterAlternancia + " " : letraActual);
            if (letraASCII % 2 == 0 && caracterAlternancia == '+') {
                caracterAlternancia = '-';
            } else {
                if (letraASCII % 2 == 0 && caracterAlternancia == '-') {
                    caracterAlternancia = '+';
                }
            }
        }
    }
}
