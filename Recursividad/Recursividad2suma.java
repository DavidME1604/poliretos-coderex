/*
 * R02) crear un metodo recursivo para obtener la suma(a,b)
 */

package Recursividad;

import java.util.Scanner;

public class Recursividad2suma {
    public void imprimir(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a=scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b=scan.nextInt();
        System.out.println("La suma de " + a + " y " + b + " es igual a: " + suma(a, b));
    }

    public int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return suma(a ^ b, (a & b) << 1);
        }
    }
    
}
