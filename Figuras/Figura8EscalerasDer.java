package Figuras;
public class Figura8EscalerasDer {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Crear una escalera de derecha a izquierda
     *                      ___
                        ___|
                    ___|
                ___|
     */
    public void EscalerasDer(int tamanioFigura){
        int niveles= tamanioFigura;
        for(int i=1; i<= niveles; i++){
            for(int j=1; j<=5*(niveles-i); j++){
                System.out.print(" ");
            }
        System.out.print("___|");
        System.out.println();
        }
    }

}
