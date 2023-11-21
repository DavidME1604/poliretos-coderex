public class Serieuno {
    public void imprimirSerie(int nPosiciones) {
        System.out.print("Serie 1      ");
        int nAnterior = 0;
        int nActual = 1;

        for (int i = 0; i < nPosiciones; i++) {
            System.out.print(nAnterior + " ");
            int suma = nAnterior + nActual;
            nAnterior = nActual;
            nActual = suma;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Serieuno serieuno = new Serieuno();

        serieuno.imprimirSerie(8);
    }
}
