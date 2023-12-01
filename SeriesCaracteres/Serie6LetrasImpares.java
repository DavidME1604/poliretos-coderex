package SeriesCaracteres;

public class Serie6LetrasImpares {
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
