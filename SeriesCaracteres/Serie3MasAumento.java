package SeriesCaracteres;

public class Serie3MasAumento {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear la siguiente serie:
     *+	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ...  
     * 
     *  
     *...
     */
    public void Serie3(int numeroElementos) {
        int numGrupos = numeroElementos;

        System.out.println("Serie 3 sando for: " + generarSerie(numGrupos, "for"));
        System.out.println("Serie 3 do-while: " + generarSerie(numGrupos, "do-while"));
        System.out.println("Serie 3 while: " + generarSerie(numGrupos, "while"));
    }

    public static String generarSerie(int numGrupos, String tipoBucle) {
        StringBuilder serie = new StringBuilder();
        int i = 1;

        switch (tipoBucle) {
            case "for":
                for (i = 1; i <= numGrupos; i++) {
                    serie.append("+".repeat(2 * i - 1));

                    if (i < numGrupos) {
                        serie.append(" ");
                    }
                }
                break;

            case "do-while":
                do {
                    serie.append("+".repeat(2 * i - 1));

                    if (i < numGrupos) {
                        serie.append(" ");
                    }

                    i++;
                } while (i <= numGrupos);
                break;

            case "while":
                while (i <= numGrupos) {
                    serie.append("+".repeat(2 * i - 1));

                    if (i < numGrupos) {
                        serie.append(" ");
                    }

                    i++;
                }
                break;

            default:
                throw new IllegalArgumentException("Tipo de bucle no válido: " + tipoBucle);
        }

        return serie.toString();
    }
}
