package Figuras;

public class Figura3TrianguloIzquierda {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Crear un triangulo rectangulo de acuerdo a la cantidad pedida
     *  *                                                               
        * *
        * * *
        * * * *
        * * * * * 
     */
    public void TrianguloIzquierda(int tamanioFigura){
        int niveles=tamanioFigura;
        for (int i = 0; i <=niveles ; i++) {
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}