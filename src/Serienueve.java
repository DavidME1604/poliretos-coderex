public class Serienueve {
    public void imprimirSerie(int nPosiciones) {
        System.out.print("Serie 9   ");
        int nActual = 2;

        for (int i = 0; i < nPosiciones; i++) {
            System.out.print(nActual + " ");
            nActual *= 2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Serienueve serienueve = new Serienueve();

        serienueve.imprimirSerie(8);
    }
}

