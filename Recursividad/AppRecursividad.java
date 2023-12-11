package Recursividad;

import java.util.Scanner;

public class AppRecursividad {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Recursividad1factorial oRecursivo1 = new Recursividad1factorial();
        System.out.println("[ Rec. 1 ] - Factorial recursivo");
        System.out.print("Ingrese un número: ");
        int numero = reader.nextInt();
        oRecursivo1.imprimirFactorial(numero);
        System.out.println();

        Recursividad2suma oRecursivo2 = new Recursividad2suma();
        System.out.println("[ Rec. 2 ] - Suma recursiva");
        System.out.print("Ingrese un numero: ");
        int a=reader.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = reader.nextInt();
        oRecursivo2.imprimir(a,b);
        System.out.println();

        Recursividad3Producto oRecursividad3 = new Recursividad3Producto();
        System.out.println("[ Rec. 3 ] - Producto recursivo");
        System.out.print("Ingrese un numero: ");
        int c = reader.nextInt();
        System.out.print("Ingrese otro numero: ");
        int d = reader.nextInt();
        while (c < 0 || d < 0) {
        System.out.println("Los números deben ser positivos: ");
        System.out.print("Ingrese un numero: ");
        c = reader.nextInt();  
        System.out.print("Ingrese otro numero: ");
        d = reader.nextInt(); 
        }
        oRecursividad3.mostrarProducto(c,d);
        System.out.println("\n");
        
        Recursividad4Potencia oRecursivo4 = new Recursividad4Potencia();
        System.out.println("[ Rec.4 ] - Operacion potencia: ");
        System.out.print("Ingrese la base: ");
        int numBase = reader.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exp = reader.nextInt();
        oRecursivo4.mostrar(numBase, exp);
        System.out.println("\n");

        Recursividad5ConteoProgresivo oRecursivo5 = new Recursividad5ConteoProgresivo();
        System.out.println("[ Rec. 5 ] - Contador progresivo: ");
        System.out.print("Ingrese hasta que numero desea contar: ");
        int n = reader.nextInt();
        oRecursivo5.conteoProgresivo(n);
        System.out.println();

        Recursividad6ConteoRegresivo conteoRegresivo = new Recursividad6ConteoRegresivo();
        System.out.println("[ Rec. 6 ] - Conteo Regresivo");
        System.out.print("Ingrese un número para iniciar el conteo: ");
        int numeroIniciar = reader.nextInt();
        conteoRegresivo.conteoRegresivo(numeroIniciar);
        System.out.println();

    }
}
