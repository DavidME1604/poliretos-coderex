package SeriesCaracteres;
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

public class Serie1MasMenos {
    /**
     * Serie uno.
     * @param numeroElementos
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
    
