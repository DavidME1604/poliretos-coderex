public class SerieMultiplicacionPorTres {
    public void MultiplicacionPor3For(int nPosiciones) {
        int primerTermino = 3;
        for (int i=1;i<=nPosiciones;i++) {
            System.out.print(primerTermino +" ");
            primerTermino *= 3;
            }
    }
    public void MultiplicacionPor3Do(int nPosiciones){
        int primerTermino =3;
        int i = 0;
        do{
            System.out.print(primerTermino +" ");
            primerTermino *= 3;
            i++;
        }while (i< nPosiciones);
    }
    public void MultiplicacionPor3While(int nPosiciones){
        int primerTermino = 3;
        int i = 0;
        while (i < nPosiciones){
        System.out.print(primerTermino+" ");
        primerTermino *=3;
        i++;
        }
    }
    
}
