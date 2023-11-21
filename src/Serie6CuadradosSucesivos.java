public class Serie6CuadradosSucesivos {
    /* Serie6: 1 4 9 16 25 36 49 64 .... */
    public void numcuadrado_For(int nPosiciones) {
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print(i * i + " ");
        }
    }

    public void numcuadrado_DoWhile(int nPosiciones) {
        int num = 1;
        do {
            System.out.print((num * num) + " ");
        } while (++num <= nPosiciones);
    }

    public void numcuadrado_While(int nPosiciones) {
        int num = 1;
        while (num <= nPosiciones) {
            System.out.print((num * num) + " ");
            num++;
        }
    }
}
