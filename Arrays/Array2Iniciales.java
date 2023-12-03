/*
 * Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz
            Ejemplo:    Mi nombre es Johann Pasquel => JP    
            Ingrese el tamaño: 5
            Ingrese caracter : *

            *****   *****      
              *     *   *      
              *     *****      
              *     *                   
            ***     *  
 */

package Arrays;

public class Array2Iniciales {
    public void incialesletras(int tamaño,char caracter){
        char[][] letraJ = new char[tamaño][tamaño];
        char[][] letraP = new char[tamaño][tamaño];

        // fill matrices with initials
        for (int i = 0; i < tamaño; i++) {
            letraJ[i][0] = caracter;
            letraJ[i][tamaño - 1] = caracter;
            letraJ[tamaño - 1][i] = caracter;
            if (i >= tamaño / 2) {
                letraJ[i][tamaño - 1] = caracter;
            }
            letraP[i][0] = caracter;
            letraP[0][i] = caracter;
            letraP[i][tamaño - 1] = caracter;
            if (i == 0 || i == tamaño / 2) {
                letraP[i][1] = caracter;
            }
            if (i == 1 || i == tamaño / 2) {
                letraP[i][2] = caracter;
            }
            if (i == 2 || i == tamaño / 2) {
                letraP[i][3] = caracter;
            }
            if (i == 3 || i == tamaño / 2) {
                letraP[i][4] = caracter;
            }
        }

        //imprimir matrices 
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < 2 * tamaño - 1; j++) {
                System.out.print(letraJ[i][j]);
            }
            System.out.print("  ");
            for (int j = 0; j < 2 * tamaño - 1; j++) {
                System.out.print(letraP[i][j]);
            }
            System.out.println();
        }
        
    }
}
