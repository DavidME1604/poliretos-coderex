package Arrays;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



        Arrays4NombreMatriz oArray4 = new Arrays4NombreMatriz();
        System.out.print("Ingrese su nombre: ");
        String nombre=reader.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido=reader.nextLine();
        System.out.println("Nombre en una matriz en X: ");
        oArray4.nombreMatriz(nombre, apellido);
        System.out.println();


        reader.close();
    }

}
