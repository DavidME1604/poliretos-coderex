package Recursividad;

/**
     * Presenta tu nombre en un plano.
     * 
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-10
     * 
     * @license
 */

import java.util.Scanner;
public class Recursividad3Producto {

    public void mostrarProducto( int c , int d){
        System.out.print("El resultado de la multiplicación de " + c + " y " + d + " es igual a: " + producto(c, d));
    }

    private static int producto(int c, int d) {
        if (d == 0) {
            return 0;
        } else {
            return c + producto(c, d - 1);
        }  
    }

}

