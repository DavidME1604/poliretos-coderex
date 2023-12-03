/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * R02) crear un metodo recursivo para obtener la suma(a,b)
*/


package Recursividad;

public class Recursividad2suma {
    /**
     * Imprimir la suma recursiva
     * @param a
     * @param b
     */
    public void imprimir(int a,int b){
        System.out.println("La suma de " + a + " y " + b + " es igual a: " + suma(a, b));
    }

    /**
     * Metodo recursivo
     * @param a
     * @param b
     * @return
     */

    public int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return suma(a ^ b, (a & b) << 1);
        }
    }
    
}
