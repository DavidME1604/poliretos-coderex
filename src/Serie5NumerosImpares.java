public class Serie5NumerosImpares {
    public void NumerosPrimosFor(int nPosiciones) {
        boolean noPrimo = false;
        for (int i = 2, contador = 0; contador < nPosiciones; i++) {
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

    public void NumerosPrimosDo(int nPosiciones) {
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
        } while (contadorElementos < nPosiciones);
    }

    public void NumerosPrimosWhile(int nPosiciones) {
        boolean noPrimo = false;
        int contador = 0, numero = 2, divisor = 2;
        while (contador < nPosiciones) {
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
            divisor =2;
            numero++;
        }
    }

}
