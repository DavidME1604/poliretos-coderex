/*
 * S9:  a  b  c  dd  eee  fffff  gggggggg ... 
 */

package SeriesCaracteres;

public class Serie10letrassum2 {
    public void sumaelementosantes(int numeroElementos){
        int[] series = new int[numeroElementos];
        series[0] = 1;
        series[1] = 1;
        series[2] = 1;

        for (int i = 3; i < numeroElementos; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        for (int i = 0; i < numeroElementos; i++) {
            if (i == 3) {
                for (int j = 0; j < 2; j++) {
                    System.out.print((char) ('a' + i));
                }
            } else if (i == 4) {
                for (int j = 0; j < 3; j++) {
                    System.out.print((char) ('a' + i));
                }
            } else {
                for (int j = 0; j < series[i]; j++) {
                    System.out.print((char) ('a' + i));
                }
            }
            if (i < numeroElementos - 1) {
                System.out.print(" "); 
            }
        }
        System.out.println();
    }
}


