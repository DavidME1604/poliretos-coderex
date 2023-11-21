public class Serie10MultiplosDos {
    public void MultiplosDosFor(int nPosiciones) {
        for (int i = 1, nAnt = 0; i <= nPosiciones; nAnt += i * 2, i++) {
            System.out.print(i * 2 + nAnt + " ");
        }
    }

    public void MultiplosDosDo(int nPosiciones) {
        int nActual = 1, nAnt = 0;
        do {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        } while (nActual++ < nPosiciones);
    }

    public void MultiplosDosWhile(int nPosiciones) {
        int nActual = 0, nAnt = 0;
        while (++nActual <= nPosiciones) {
            System.out.print(nActual * 2 + nAnt + " ");
            nAnt += nActual * 2;
        }
    }
}
