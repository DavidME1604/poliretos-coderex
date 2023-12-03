package Recursividad;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
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
