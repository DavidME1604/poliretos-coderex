package SeriesCaracteres;

public class Serie1MasMenos {
    /**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *        
         +-+-+-+-+-
     */

    public void imprimirSerieS1(int numeroElementos) {
        
        for (int i = 0; i < numeroElementos; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
    }
}
    
