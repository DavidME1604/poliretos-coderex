package Arrays;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Arrays2Iniciales oArray2 = new Arrays2Iniciales();
        System.out.print("Ingresa el tamaño de la matriz: ");
        int tamaño = reader.nextInt();
        System.out.print("Ingresa el caracter que deseas usar: ");
        char caracter = reader.next().charAt(0);
        oArray2.incialesletras(tamaño,caracter);
        System.out.println();

        Arrays1porcentaje oArray1 = new Arrays1porcentaje();
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = reader.nextLine();
        String[] palabras = nombreCompleto.split("\\s+");
        int[] porcentajesCarga = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
        System.out.print("Ingrese el porcentaje de carga para \"" + palabras[i] + "\": ");
        porcentajesCarga[i] = reader.nextInt();
        }
        System.out.println("\n" + nombreCompleto);
        for (int i = 0; i < palabras.length; i++) {
        oArray1.mostrarPorcentajeCarga(palabras[i], porcentajesCarga[i]);
        }
        System.out.println();

        Arrays4NombreMatriz oArray4 = new Arrays4NombreMatriz();
        System.out.print("Ingrese su nombre: ");
        String nombre=reader.nextLine();
        nombre=reader.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido=reader.nextLine();
        System.out.println("Nombre en una matriz en X: ");
        oArray4.nombreMatriz(nombre, apellido);
        System.out.println();

        Arrays5MatrizAleatoria oArrray5 = new Arrays5MatrizAleatoria();
        System.out.print("Ingrese su nombre Completo: ");
        String nombreCompleto=reader.nextLine();
        System.out.println("Matrices Aleatorias");
        oArrray5.MatrizAleatoria(nombreCompleto);
        System.out.println();
        


        reader.close();
        }

}
