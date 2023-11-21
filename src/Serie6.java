public class Serie6 {
    /*Serie6:  1  4   9   16  25  36  49  64 .... */
    int contador =8;
    public void numcuadrado_For(int contador) {
        for (int i = 1; i <= contador; i++) {
            System.out.print(i * i + " ");
        }
    }

    public void numcuadrado_DoWhile(int contador){
        int num = 1;
        do{
            System.out.print((num*num)+" ");
        }while(++num <=contador);
    }

    public void numcuadrado_While(int contador) {
        int num = 1;
        while (num <= contador) {
            System.out.print((num * num) + " ");
            num++;
        }
    }
    public static void main(String[] args) {
        Serie6 serie = new Serie6();
        int contador = 8;

        System.out.println("Serie de cuadrados con for:");
        serie.numcuadrado_For(contador);

        System.out.println("\nSerie de cuadrados con do-while:");
        serie.numcuadrado_DoWhile(contador);

        System.out.println("\nSerie de cuadrados con while:");
        serie.numcuadrado_While(contador);
    }
}
