package Figuras;

public class Figura13TrianguloNum {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Crear un triangulo de numeros
     *  1
     *  12
     *  123
     *  1234
     *  12345
     *  123456
     *  1234567
     *  12345678
     *  123456789
     *...
     */
    public void TrianguloNum(int tamanioFigura){
        int filas = tamanioFigura;
        for (int i=1 ;i<filas;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}    
