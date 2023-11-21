public class Serie6CuadradosSucesivos {
    /*
     * @author Johann Vladimir Pasquel Montenegro
     * @Github Vladimirjon
     * 
     * version 2.0  
     *
     * @since 2023-11-21
     * 
     * @license
     */

    /* 
     * S6: 1 4 9 16 25 36 49 64 ...
     * 
     * Esta es una serie de cuadrados sucesivos en la que: 
     * Se parte de 1 2 3 4 5 6 7 8 
     * Y se eleva al cuadrado cada numero(^2)
     * De esta manera se obtiene la serie
     *
     */

    /* numcuadrado_For calcula la serie utilizando el bucle for para obtener: 
     * 1 4 9 16 25 36 49 64 ...
     * 
     * @param nPosiciones 
     */
    public void numcuadrado_For(int nPosiciones) {
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print(i * i + " ");
        }
    }

    /* numcuadrado_DoWhile calcula la serie utilizando Do-While para obtener: 
     * 1 4 9 16 25 36 49 64 ...
     * 
     * @param nPosiciones 
     */
    public void numcuadrado_DoWhile(int nPosiciones) {
        int num = 1;
        do {
            System.out.print((num * num) + " ");
        } while (++num <= nPosiciones);
    }

    /* numcuadrado_While calcula la serie utilizando While para obtener: 
     * 1 4 9 16 25 36 49 64 ...
     * 
     * @param nPosiciones 
     */
    public void numcuadrado_While(int nPosiciones) {
        int num = 1;
        while (num <= nPosiciones) {
            System.out.print((num * num) + " ");
            num++;
        }
    }
}
