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

    /**
     * Serie S6 con Do-While
     * @param numeroElementos
     */
    public void letrasImparesDo(int numeroElementos) {
        char letraActual, caracterAlternancia = '+', contadorElementos = 0, letraASCII = 97;
        do {
            letraActual = (char) letraASCII;
            System.out.print((letraASCII % 2 == 0) ? " " + caracterAlternancia + " " : letraActual);
            if (letraASCII % 2 == 0 && caracterAlternancia == '+') {
                caracterAlternancia = '-';
            } else {
                if (letraASCII % 2 == 0 && caracterAlternancia == '-') {
                    caracterAlternancia = '+';
                }
            }
            letraASCII++;
        } while (++contadorElementos < numeroElementos);
    }

    /**
     * Serie S6 con While
     * @param numeroElementos
     */
    public void letrasImparesWhile(int numeroElementos) {
        char letraActual, caracterAlternancia = '+', contadorElementos = 0, letraASCII = 97;
        while (++contadorElementos <= numeroElementos) {
            letraActual = (char) letraASCII;
            System.out.print((letraASCII % 2 == 0) ? " " + caracterAlternancia + " " : letraActual);
            if (letraASCII % 2 == 0 && caracterAlternancia == '+') {
                caracterAlternancia = '-';
            } else {
                if (letraASCII % 2 == 0 && caracterAlternancia == '-') {
                    caracterAlternancia = '+';
                }
            }
            letraASCII++;
        }
    }
}
