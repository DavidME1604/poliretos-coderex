/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz
    *        Ejemplo:    Mi nombre es Johann Pasquel => JP    
    *        Ingrese el tamaño: 5
    *        Ingrese caracter : *
    *
    *        *****   *****      
    *          *     *   *      
    *          *     *****      
    *          *     *                   
    *        ***     *  
*/

package Arrays;

public class Array2Iniciales {
    /**
     * Se trabajara con la creacion de las dos letras para mas tarde unirlas
     * @param tamaño
     * @param caracter
     */
    public void incialesletras(int tamaño,char caracter){
        char[][] primera = new char[tamaño][tamaño];
        char[][] segunda = new char[tamaño][tamaño];

        for (int i = 0; i < primera.length; i++) {
            for (int j = 0; j < primera[i].length; j++) {
                if ((i == 0) || (j == tamaño / 2) || (j < tamaño / 2 && i == tamaño - 1)) {
                    primera[i][j] = caracter;
                } else {
                    primera[i][j] = ' ';
                }
                if ((i == 0 || i == tamaño / 2 || j == 0) || (i < tamaño / 2 && j == segunda[i].length - 1) || (j > tamaño / 2 && j == 0)) {
                    segunda[i][j] = caracter;
                } else {
                    segunda[i][j] = ' ';
                }
            }
        }
        char[][] matriz = new char[tamaño][2 * tamaño + 2]; 

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = primera[i][j];
                matriz[i][j + tamaño + 2] = segunda[i][j];
            }
        }

        for (int i = 0; i < tamaño + 1; i++) {
            for (int j = 0; j < 2 * tamaño + 2; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
}
