public class Serie3FibonacciImpar {
    /*
     * @author Johann Vladimir Pasquel Montenegro
     * @Github Vladimirjon
     * version 2.0  
     *
     * @since 2023-11-21
     * 
     * @license
     */

    /* 
     * S3: 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
     * 
     * Esta es una serie fraccionaria en la cual: 
     * Numerador: Serie de Fibonacci
     * Denominador: Numeros impares
     * 
     */

    /** fraccion_For calcula la serie utilizando el bucle for para obtener: 
     * 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
     * 
     * @param nPosiciones 
     */
    public void fraccion_For(int nPosiciones) {
        int numeradorantes = 0;
        int numeradornow = 1;
        int denominador = 1;
        for (int i = 0; i < nPosiciones; i++) {
            System.out.print(numeradorantes + "/" + denominador + " ");
            int newnumerador = numeradorantes + numeradornow;
            numeradorantes = numeradornow;
            numeradornow = newnumerador;
            denominador += 2;
        }
    }

    /** fraccion_DoWhile calcula la serie utilizando el Do While para obtener: 
     * 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
     * 
     * @param nPosiciones 
     */
    public void fraccion_DoWhile(int nPosiciones) {
        int numeradorAntes = 0;
        int numeradornow = 1;
        int denominador = 1;
        int num = 0;

        do {
            System.out.print(numeradorAntes + "/" + denominador + " ");
            int newnumerador = numeradorAntes + numeradornow;
            numeradorAntes = numeradornow;
            numeradornow = newnumerador;
            denominador += 2;
        } while (++num < nPosiciones);
    }

     /** fraccion_While calcula la serie utilizando el While para obtener: 
     * 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
     * 
     * @param nPosiciones 
     */
    public void fraccion_While(int nPosiciones) {
        int numeradorAntes = 0;
        int numeradornow = 1;
        int denominador = 1;
        int num = 0;

        while (++num <= nPosiciones) {
            System.out.print(numeradorAntes + "/" + denominador + " ");
            int newnumerador = numeradorAntes + numeradornow;
            numeradorAntes = numeradornow;
            numeradornow = newnumerador;
            denominador += 2;
        }
    }
}
