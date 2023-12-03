/*
 * S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
 */

package SeriesCaracteres;

public class Serie5palitos {
    public String a;
    public void palitosinclinados(int numeroElementos){
        StringBuilder serie = new StringBuilder();

        for (int i = 0; i < numeroElementos; i++) {
            serie.append("\\ | / - ");
        }

        System.out.println(serie);
    }
}
