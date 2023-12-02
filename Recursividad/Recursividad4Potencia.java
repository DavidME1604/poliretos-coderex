package Recursividad;

import java.util.Scanner;

public class Recursividad4Potencia {
    public void mostrar() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int numBase = reader.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exp = reader.nextInt();
        System.out.print("La base " + numBase + " elevado a " + exp + " es igual a: " + potencia(numBase, exp));

    }

    public int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }

    }
}
