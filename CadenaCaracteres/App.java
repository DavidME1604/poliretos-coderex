package CadenaCaracteres;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       

        Cadena3EliminarVocal oCadena3 = new Cadena3EliminarVocal();
        System.out.print("Ingresa una vocal: ");
        String vocal = reader.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = reader.nextLine();
        System.out.println("Elimina vocales de una palabra: ");
        oCadena3.EliminarVocal(vocal, palabra);
        System.out.println();

        System.out.println("\nJuego de los anagramas:");
        Cadena8Anagramas oCadena8 = new Cadena8Anagramas();
        oCadena8.Anagramas();
        System.out.println();

        reader.close();
    }
}
