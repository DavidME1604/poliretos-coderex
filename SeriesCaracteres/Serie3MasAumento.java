package SeriesCaracteres;

public class Serie3MasAumento {
    /*
     * @author José David Pallares Santamaría
     * 
     * @Github JosDavP
     * 
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear la siguiente serie:
     * + +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
     * 
     * 
     * ...
     */
    public void Serie3(int numeroElementos) {
        StringBuilder serie = new StringBuilder();
        for (int i = 1; i <= numeroElementos; i++) {
            serie.append("+".repeat(2 * i - 1));

            if (i < numeroElementos) {
                serie.append(" ");
            }
        }

        System.out.print(serie.toString());
    }
}
