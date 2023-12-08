package Figuras;
/**
 * Clase que permite ingresar un nombre completo, solicitar porcentajes de carga
 * para cada palabra 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Figura9PrimamideSegmentos {
    

    public void imprimirPiramide(int tamanioFigura) {
        for (int i = 1; i <= tamanioFigura; i++) {
            
            for (int j = 1; j <= (tamanioFigura - i) * 3; j++) {
                System.out.print(" ");
            }

            
            if (i == 1) {
                System.out.print(" ___");
            } else {
                
                System.out.print("___|");

                
                for (int k = 1; k <= 3 + (i - 2) * 6; k++) {
                    System.out.print(" ");
                }

                
                System.out.print("|___");
            }

            
            System.out.println();
        }
    }
}
