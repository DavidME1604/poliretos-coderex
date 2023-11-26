public class Serie5NumerosImpares {
    /**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S5: 2 3 5 7 11 13 17 19 23 29 31...
     */

    /**
     * NumerosPrimosFor calcula la serie usando el ciclo For : 2 3 5 7 11 13 17 19
     * 
     * @param numeroElementos
     */
    public void NumerosPrimosFor(int numeroElementos) {
        boolean noPrimo = false;
        for (int i = 2, contador = 0; contador < numeroElementos; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    noPrimo = true;
                    break;
                }
            }
            if (!noPrimo) {
                System.out.print(i + " ");
                contador++;
            } else {
                noPrimo = false;
            }
        }
    }

    /**
     * NumerosPrimosDo calcula la serie usando el ciclo Do-While : 2 3 5 7 11 13 17
     * 
     * @param numeroElementos
     */
    public void NumerosPrimosDo(int numeroElementos) {
        int contadorElementos = 0, numero = 2, divisor = 1, contadorDivisores = 0;
        do {
            do {
                if (numero % divisor == 0) {
                    contadorDivisores++;
                }
                if (contadorDivisores > 2) {
                    break;
                }
            } while (divisor++ < numero);
            if (contadorDivisores <= 2) {
                System.out.print(numero + " ");
                contadorElementos++;
            }
            numero++;
            contadorDivisores = 0;
            divisor = 1;
        } while (contadorElementos < numeroElementos);
    }

    /**
     * NumerosPrimosWhile calcula la serie usando el ciclo While : 2 3 5 7 11 13 17
     * 
     * @param numeroElementos
     */
    public void NumerosPrimosWhile(int numeroElementos) {
        boolean noPrimo = false;
        int contador = 0, numero = 2, divisor = 2;
        while (contador < numeroElementos) {
            while (divisor < numero) {
                if (numero % divisor == 0) {
                    noPrimo = true;
                    break;
                }
                divisor++;
            }
            if (!noPrimo) {
                System.out.print(numero + " ");
                contador++;
            } else {
                noPrimo = false;
            }
            divisor = 2;
            numero++;
        }
    }

}
