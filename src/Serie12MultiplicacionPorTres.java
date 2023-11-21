public class Serie12MultiplicacionPorTres {
    /*
     * @author David Esteban Morales Estrella
     * 
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Serie S12: 2  6   12  20  30  42  56  72  ...
     */
    
    /**
     * IncremenoTresFor calcula la serie usando el ciclo For : 2  6   12  20  30  42  56  72  ...
     * @param nPosiciones
     */
    public void MultiplicacionPor3For(int nPosiciones) {
        int primerTermino = 3;
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
        }
    }

    /**
     * IncremenoTresFor calcula la serie usando el ciclo Do-While : 2  6   12  20  30  42  56  72  ...
     * @param nPosiciones
     */
    public void MultiplicacionPor3Do(int nPosiciones) {
        int primerTermino = 3;
        int i = 0;
        do {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        } while (i < nPosiciones);
    }

    /**
     * IncremenoTresFor calcula la serie usando el ciclo While : 2  6   12  20  30  42  56  72  ...
     * @param nPosiciones
     */
    public void MultiplicacionPor3While(int nPosiciones) {
        int primerTermino = 3;
        int i = 0;
        while (i < nPosiciones) {
            System.out.print(primerTermino + " ");
            primerTermino *= 3;
            i++;
        }
    }

}
