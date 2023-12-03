/*  _+_
        |_-_
            |_+_
                |_-_
                    |_+_
                        |
 */

package Figuras;

public class Figura10Escalera {
    public String figura1;
    public String figura2;
    public void Escalera(int tamanioFigura){
        figura1 = "|_+_";
        figura2 = "|_-_";
        for(int i=0;i<tamanioFigura;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("    ");
            }
            if(i%2==0){
                System.out.println(figura1);
            }else{
                System.out.println(figura2);
            }
        }
    }
}
