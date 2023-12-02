package SeriesCaracteres;

public class Serie2MasFibonacci {
    public void SerieMasFibonacciFor(int numeroElementos){
        for (int i = 0, nActual = 0, nSiguiente = 1; i <= numeroElementos; nSiguiente+=nActual, nActual = nSiguiente-nActual, i++) {
            for (int j = 0; j < nActual; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
        }
    }

    public void SerieMasFibonacciDo(int numeroElementos){
        int nActual=0, nSiguiente=1, contadorElementos=0, contadorCaracteres = 0;
        do {
            nSiguiente+=nActual;
            nActual=nSiguiente-nActual;
            contadorElementos++;
            contadorCaracteres = 0;
             do {
                System.out.print("+");
                contadorCaracteres++;
            } while (contadorCaracteres<nActual);
            System.out.print(" ");
        } while (contadorElementos<numeroElementos);
    }

    public void SerieMasFibonacciWhile(int numeroElementos){
        int nActual=0, nSiguiente=1, contadorElementos=0, contadorCaracteres = 0;
        while (contadorElementos <= numeroElementos) {
            while (contadorCaracteres<nActual) {
                System.out.print("+");
                contadorCaracteres++;
            }
            System.out.print(" ");
            contadorCaracteres=0;
            nSiguiente+=nActual;
            nActual=nSiguiente-nActual;
            contadorElementos++;
        }
    }
}
