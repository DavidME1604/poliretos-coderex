package Recursividad;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Recursividad2suma oRecursivo2 = new Recursividad2suma();
        System.out.println("Suma recursiva");
        System.out.print("Ingrese un numero: ");
        int a=reader.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = reader.nextInt();
        oRecursivo2.imprimir(a,b);
        System.out.println();

        
        Recursividad4Potencia oRecursivo4 = new Recursividad4Potencia();
        System.out.println("Operacion potencia: ");
        System.out.print("Ingrese la base: ");
        int numBase = reader.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exp = reader.nextInt();
        oRecursivo4.mostrar(numBase, exp);
        System.out.println();

        reader.close();

    }
}
