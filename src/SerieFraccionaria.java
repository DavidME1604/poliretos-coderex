/* Copuright (C) 2K23, grupo3
 *jose.pallares@epn.edu.ec
 *version1.0
 */
public class SerieFraccionaria {
    public void SerieFraccionariaFor(int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        for (int i = 0; i<nPosiciones; i++){
            System.out.print(numerador1 +"/");
            System.out.print(denominador1 + " ");
            int signumerador= numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            
        }
    }
    public void SerieFraccionariaDo(int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i=0;
        do {
            System.out.print(numerador1+"/");
            System.out.print(denominador1+" ");
            int signumerador= numerador1+ numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1+=salto;
            i++;
            } while (i < nPosiciones);
        }
    public void SerieFraccionariaWhile(int nPosiciones){
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i =0;
        while (i < nPosiciones) {
            System.out.print(numerador1+"/");
            System.out.print(denominador1+" ");
            int signumerador= numerador1+ numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1+=salto;
            i++;
            
        }
    
    }
    
}
