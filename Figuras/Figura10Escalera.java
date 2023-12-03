/*  _+_
        |_-_
            |_+_
                |_-_
                    |_+_
                        |
 */

 /*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * _+_
    *    |_-_
    *        |_+_
    *            |_-_
    *                |_+_
    *                    |
     
*/

package Figuras;

public class Figura10Escalera {
    /**
     * La serie se carga con dos elementos
     * figura1 y figura2
     * @param tamanioFigura
     */
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
