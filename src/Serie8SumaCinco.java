public class Serie8SumaCinco {
    public void SumaCincoFor(int nPosiciones){
        for (int i = 3, contadorElementos=0; contadorElementos < nPosiciones; i+=5, contadorElementos++) {
            System.out.print(i+" ");
        }
    }

    public void SumaCincoDo(int nPosiciones){
        int contadorElementos=0, numero=3;
        do {
            System.out.print(numero+" ");
            numero += 5;
        } while (contadorElementos++<nPosiciones-1);
    }
    
    public void SumaCincoWhile(int nPosiciones){
        int contadorElementos=0, numero=3;
        while (contadorElementos++<nPosiciones) {
            System.out.print(numero+" ");
            numero += 5;
        }
    }
}
