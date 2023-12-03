 /*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
*/


package SeriesCaracteres;

public class Serie5palitos {
    /**
     *@param numeroElementos
     *  
     */
    public String a;
    public void palitosinclinados(int numeroElementos){
        StringBuilder serie = new StringBuilder();

        for (int i = 0; i < numeroElementos; i++) {
            serie.append("\\ | / - ");
        }

        System.out.println(serie);
    }
}
